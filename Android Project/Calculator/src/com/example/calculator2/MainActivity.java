package com.example.calculator2;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{

    private static final int SAVIOR = 0;
	private static final int LENGTH_LONG = 1;
	private EditText enum1,enum2,result;
	private Button add,sub,div,mul,fac, next;
    private EditText name,age;
    private SharedPreferences sharedPrefs;
   @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        
		name=(EditText)findViewById(R.id.name);
		age=(EditText)findViewById(R.id.age);			
		
        enum1=(EditText)findViewById(R.id.num1);
		enum2=(EditText)findViewById(R.id.num2);
		result=(EditText)findViewById(R.id.result);
		
		add=(Button)findViewById(R.id.add);
		sub=(Button)findViewById(R.id.subtract);
		mul=(Button)findViewById(R.id.multiply);
		div=(Button)findViewById(R.id.divide);
		fac=(Button)findViewById(R.id.factorial);
		next=(Button)findViewById(R.id.next);
		
		add.setOnClickListener(this);
		sub.setOnClickListener(this);
		mul.setOnClickListener(this);
		div.setOnClickListener(this);
		fac.setOnClickListener(this);
		
		next.setOnClickListener(this);
		
		
	}
    
   
	//private Button.OnClickListener myListener = new Button.OnClickListener()
	//{
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int inum1, inum2, ans=1;
		String error="";
		if (TextUtils.isEmpty(enum1.getText().toString())){
			inum1=0;
		} else {
			inum1=Integer.parseInt(enum1.getText().toString());
		}
		if (TextUtils.isEmpty(enum2.getText().toString())){
			inum2=0;
		} else {
			inum2=Integer.parseInt(enum2.getText().toString());
		}
		
		switch (v.getId()) {
		case R.id.add:
			ans=inum1+inum2;
			break;
		case R.id.subtract:
			ans=inum1-inum2;
			break;
		case R.id.multiply:
			ans=inum1*inum2;
			break;
		case R.id.divide:
			try{
				ans=inum1/inum2;
			}catch (Exception e){
				error="Error: Failed attempt to divide by ";
				ans=0;
			}
			/*
			if (inum2<1){
				ans=0;
			} else {
			ans=inum1/inum2;
			}
			*/
			break;
		case R.id.factorial:
			for(int i = 2; i<=inum1; i++){
				ans=ans*i;
			}
			break;
		case R.id.next:
			ans=0;
			Intent intent = new Intent(MainActivity.this, Save.class);
            startActivityForResult(intent,SAVIOR);  
			//startActivity(intent);
			break;
		default:
			break;
		}
		//String answer = String.valueOf(ans);
		//result.setText(answer);
		result.setText(error + "" + ans);
	}
	//};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		//super.onActivityResult(requestCode, resultCode, data);
	  
		switch(requestCode){
		case SAVIOR:
			if (resultCode == Activity.RESULT_OK) {
		    	String getname,getage;
		    	sharedPrefs = getSharedPreferences("com.example.calculator2",MODE_PRIVATE);
				getname=sharedPrefs.getString("Name", "No Name Saved");
				getage=sharedPrefs.getString("Age","No Age Saved");
		    	name.setText(getname);
		  		age.setText(getage);
		  		String msg = "Data Imported";
		  		Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
			}
			break;
		  default:
			break;
	  }
	}
	
}
