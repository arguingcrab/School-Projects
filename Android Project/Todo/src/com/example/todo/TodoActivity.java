package com.example.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseAnalytics;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseQuery.CachePolicy;
import com.parse.ParseUser;

public class TodoActivity extends Activity implements OnItemClickListener{
	
	private EditText TaskInput;
	private ListView ListView;
	private TaskAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_todo);
		
		//setup parse
		Parse.initialize(this, "QjYHsX9WhDcMhyRCZdxH8YtyU3Dp4G0BL4vbcoJq",
				"kQPMtPjxCEmr9fjqcEtVx3EYhy2opGqXQvit8Nlw");
		ParseAnalytics.trackAppOpened(getIntent());
		//register class
		ParseObject.registerSubclass(Task.class);

		//get current user
        ParseUser currentUser = ParseUser.getCurrentUser();
        //if no user logged in, go to login page
		if(currentUser == null){
	        Intent intent = new Intent(this, Login.class);
	        startActivity(intent);
	        finish();
        }

		//for task.class items
        adapter = new TaskAdapter(this, new ArrayList<Task>());
        //input task
		TaskInput = (EditText) findViewById(R.id.task_input);
		//task lister
		ListView = (ListView) findViewById(R.id.task_list);
		ListView.setAdapter(adapter);
        ListView.setOnItemClickListener(this);
        //update items
        updateData();        
	}

	public void updateData(){
		//parse queries to get items
        ParseQuery<Task> query = ParseQuery.getQuery(Task.class);
        query.whereEqualTo("user", ParseUser.getCurrentUser());
        query.setCachePolicy(CachePolicy.CACHE_THEN_NETWORK);
        query.findInBackground(new FindCallback<Task>() {
	        @Override
	        public void done(List<Task> tasks, ParseException error) {
                if(tasks != null){
                    adapter.clear();
                    adapter.addAll(tasks);
                }
            }
        });
	}
	
	//handles creating tasks with parse
	//sets user, desc, and not completed flag and inserts
	public void createTask(View v) {
		if (TaskInput.getText().length() > 0){
		    Task t = new Task();
		    t.setACL(new ParseACL(ParseUser.getCurrentUser()));
		    t.setUser(ParseUser.getCurrentUser());
		    t.setDescription(TaskInput.getText().toString());
		    t.setCompleted(false);
		    t.saveEventually();
		    adapter.insert(t, 0);
		    TaskInput.setText("");
        }
	} 
	
	//menu options with parse
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		//logs user out
        case R.id.action_logout: 
            ParseUser.logOut();
            //sends them back to login
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
            finish();
            return true; 
        //language selector
		case  R.id.action_settings:
			startOtherActivity();
			return true;
        } 
			
        return false; 
	}
	
	//opens dialog for user to change language using alert box (positive/ok, and negative/cancel buttons)
	private void startOtherActivity() {
        Intent i = new Intent(this, Language.class);
        // Pass the data to change default language
        i.putExtra(getString(R.string.action_settings),true);
        startActivity(i);
        TodoActivity.this.finish();
    }
	
	@Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Task task = adapter.getItem(position);
        TextView taskDescription = (TextView) view.findViewById(R.id.task_description);

        //on item click, it will set task as complete, striking it out
        task.setCompleted(!task.isCompleted());
        if(task.isCompleted()){
            taskDescription.setPaintFlags(taskDescription.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }else{
            taskDescription.setPaintFlags(taskDescription.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
        }

        //parse save
        task.saveEventually();
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.todo, menu);
		return true;
	}

}
