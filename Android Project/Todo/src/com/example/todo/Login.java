package com.example.todo;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class Login extends Activity{
	private Locale locale;
	private EditText userField;
    private EditText passField;
    private TextView errorField;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_login);
	
	    //fields for user/pass
	    userField = (EditText) findViewById(R.id.login_username);
	    passField = (EditText) findViewById(R.id.login_password);
	    errorField = (TextView) findViewById(R.id.error_messages);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	    // Inflate the menu; this adds items to the action bar if it is present.
	    getMenuInflater().inflate(R.menu.login, menu);
	    return true;
    }
    
    public void signIn(final View v){
        v.setEnabled(false);
        ParseUser.logInInBackground(userField.getText().toString(), passField.getText().toString(), new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (user != null) {
                    Intent intent = new Intent(Login.this, TodoActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Signup failed. Look at the ParseException to see what happened.
                    switch(e.getCode()){	                    
	                    case ParseException.OBJECT_NOT_FOUND:
	                    	//checks locale language starts with EN to accept all types of EN (EN_US, EN_CA)
	                    	if (Locale.getDefault().getLanguage().startsWith("en"))
	                    		errorField.setText("Sorry, those credentials were invalid.");
	                    	else
	                    		//else error message in fr
	                    		errorField.setText("Désolé, les informations d identification ne sont pas valides.");	                        
	                        break;
	                    default:
	                        errorField.setText(e.getLocalizedMessage());
	                        break;
                    }
                    v.setEnabled(true);
                }
            }
        });
    }

    //starts new register class
	public void showRegistration(View v) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
        finish();
	}
}
