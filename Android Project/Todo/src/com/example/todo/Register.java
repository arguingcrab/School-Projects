package com.example.todo;

import java.util.Locale;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class Register extends Activity {

	private Locale locale;
	private EditText userField;
    private EditText passField;
    private TextView errorField;
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		userField = (EditText) findViewById(R.id.register_username);
        passField = (EditText) findViewById(R.id.register_password);
        errorField = (TextView) findViewById(R.id.error_messages);
        
	}

	public void register(final View v){
        if(userField.getText().length() == 0 || passField.getText().length() == 0)
            return;        
        
        v.setEnabled(false);
        ParseUser user = new ParseUser();
        user.setUsername(userField.getText().toString());
        user.setPassword(passField.getText().toString());
        errorField.setText("");

        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null) {
                    Intent intent = new Intent(Register.this, TodoActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Sign up didn't succeed. Look at the ParseException
                    // to figure out what went wrong
                    switch(e.getCode()){
                    case ParseException.USERNAME_TAKEN:
                    	//check if language -starts with- en to accept all types of en
                    	if (Locale.getDefault().getLanguage().startsWith("en"))
                    		errorField.setText("Sorry, this username has already been taken.");
                    	else
                    		//else french error
                    		errorField.setText("Désolé, ce nom a déjà été prise.");
                        break;
                    //doesnt work
                    case ParseException.USERNAME_MISSING:
                    	if (Locale.getDefault().getLanguage().startsWith("en"))
                    		errorField.setText("Sorry, you must supply a username to register.");
                    	else
                    		errorField.setText("Désolé, vous devez fournir un nom d utilisateur pour vous inscrire.");
                        break;
                    //doesnt work
                    case ParseException.PASSWORD_MISSING:
                    	if (Locale.getDefault().getLanguage().startsWith("en"))
                    		errorField.setText("Sorry, you must supply a password to register.");
                    	else
                    		errorField.setText("Désolé, vous devez fournir un mot de passe pour vous inscrire.");
                        break;
                    default:
                        errorField.setText(e.getLocalizedMessage());
                    }
                    v.setEnabled(true);
                }
            }
        });
	}
	
	//show login option
	public void showLogin(View v) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
        finish();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

}
