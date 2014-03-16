package com.example.todo;
/*
 * 
 * Changing Locale language with shared preferences
 * 
 * Notes:
 * Currently shows select language on login/signin page which wont go through
 * because the user isnt signed in therefore no access to the main activity (Todo activity)
 * 
 */
import java.util.Locale;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;

public class Language extends Activity {
	private Locale locale = null;
	Configuration config;
	String language;
	
	@Override	
    public void onConfigurationChanged(Configuration newConfig)
    {
		//forces refresh on language change
        super.onConfigurationChanged(newConfig);
    }
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent i=this.getIntent();
		// Receive the data for setting default language
        boolean mustSetLanguage = i.getBooleanExtra(getString(R.string.action_settings),false);
 
        // If the default language is set, finish the current activity and switch to MainActivity
        // Otherwise, show the language dialog box
        if(!loadDefaultLanguage() || mustSetLanguage ){
            showLanguageDialog();
        }else{
            changeLanguage(language);
            startOtherActivity();
        }
	}
	private void startOtherActivity() {
		//used to run main activity after language is set and close
        Intent i = new Intent(this, TodoActivity.class);
        startActivity(i);
        Language.this.finish();
    }
	
	public void changeLanguage(String language) {
		//handles changing lang
        locale = new Locale(language);
        Locale systemLocale = Locale.getDefault();
        if (systemLocale != null && systemLocale.equals(locale)) {
            return;
        }
        //set new locale to selected language
        Locale.setDefault(locale);
        config=getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
    }
	
	public void showLanguageDialog(){
		//dialog box that sets english or french language to the (OK - positive) button and 
		//the (CANCEL - negative) button
        new AlertDialog.Builder(this).setTitle(getString(R.string.action_settings))
            .setPositiveButton("English(US)", new DialogInterface.OnClickListener() {
        	public void onClick(DialogInterface dialog, int which) {
                //change language to en and go to main activity
                changeLanguage("en_US");
                setDefaultLanguage("en_US");
                startOtherActivity();
            }
        }).setNegativeButton("French(FR)", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                //change to france french and go to main activity
                changeLanguage("fr_FR");
                setDefaultLanguage("fr_FR");
                startOtherActivity();
            }
            //show dialog
        }).show();
    }
	
	// set default language using shared preferences and commit changes
    public void setDefaultLanguage(String language) {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_WORLD_WRITEABLE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(getString(R.string.action_settings), language);
        editor.commit();
    }
    
 	//load default language by reading from sharedpreferences
    public boolean loadDefaultLanguage() {
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_WORLD_WRITEABLE);
 
        if(sharedPreferences.getString(getString(R.string.action_settings), null)==null){
            return false;
        }
        
        language = sharedPreferences.getString(getString(R.string.action_settings), null);
        return true;
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.language, menu);
		return true;
	}

}
