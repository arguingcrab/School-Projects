package com.example.calculator2;

/*
 * Reference For DatePicker
 * http://www.mkyong.com/android/android-date-picker-example/
 * 
 */
import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Save extends Activity{
    private Button load,save, select;
    private EditText name,age;
    private String sname,sage;
    private DatePicker date;    
    private int year, month, day;
    private TextView display;
    private SharedPreferences sharedPrefs;
    static final int DATE_DIALOG_ID=999;
    
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_saveme);
		
		name=(EditText)findViewById(R.id.name2);
		age=(EditText)findViewById(R.id.age2);
		
		sharedPrefs = getSharedPreferences("com.example.calculator2",MODE_PRIVATE);
		setCurrentDateOnView(); 
		addListenerOnButton();
    }

	private void addListenerOnButton() {
		// TODO Auto-generated method stub
		select=(Button)findViewById(R.id.select);
		select.setOnClickListener(new OnClickListener(){
			@SuppressWarnings("deprecation")
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(DATE_DIALOG_ID);
			}			
		});
		save=(Button)findViewById(R.id.save);
		save.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				sname=name.getText().toString();
				sage=age.getText().toString();
				// TODO Auto-generated method stub
				//savePreferences(name.getText().toString(),age.getText().toString());	
				
				SharedPreferences.Editor editor = sharedPrefs.edit();
				editor.putString("Name",sname);
				editor.putString("Age",sage);
				String msg;
				if (editor.commit())
				{
					msg = "Name and Age have been saved";
				}
				else
				{
					msg = "There was a problem saving";
				}
				
				Log.d("test", sname + sage);
				Toast.makeText(Save.this, msg, Toast.LENGTH_SHORT).show();
				//finish();
			}
			
		});
		load=(Button)findViewById(R.id.load);
		load.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				String newname = sharedPrefs.getString("Name","");
				String newage = sharedPrefs.getString("Age","");
				name.setText(newname);
				age.setText(newage);
				Log.d("Name",newname);
				Log.d("Age",newage);
				String msg="Loading";
				Toast.makeText(Save.this, msg, Toast.LENGTH_SHORT).show();
			}			
		});
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event){
		if((keyCode==KeyEvent.KEYCODE_BACK)){
			Intent resultIntent = new Intent();
			setResult(Activity.RESULT_OK,resultIntent);
			finish();
		}
		return super.onKeyDown(keyCode,event);
	}

	private void setCurrentDateOnView() {
		// TODO Auto-generated method stub
		display=(TextView)findViewById(R.id.showdate);
		date=(DatePicker)findViewById(R.id.pickdate);
		final Calendar c = Calendar.getInstance();
		year=c.get(Calendar.YEAR);
		month=c.get(Calendar.MONTH);
		day=c.get(Calendar.DAY_OF_MONTH);
		
		display.setText(new StringBuilder()
			.append("M:").append(month + 1).append("-")
			.append("D:").append(day).append("-")
			.append("Y:").append(year).append(" "));
			
		date.init(year, month, day, null);
	}
	
	@Override
	protected Dialog onCreateDialog(int id){
		switch(id){
		case DATE_DIALOG_ID:
			return new DatePickerDialog(this,datePickerListener,year,month,day);
		}
		
		return null;
	}
	
	private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {
		
		@Override
		public void onDateSet(DatePicker view, int syear, int smonth,
				int sday) {
			// TODO Auto-generated method stub
			year=syear;
			month=smonth;
			day=sday;
			
			display.setText(new StringBuilder().append(month + 1)
					   .append("-").append(day).append("-").append(year)
					   .append(" "));
			date.init(year, month, day, null);
		}
	};
}
