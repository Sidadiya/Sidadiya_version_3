package com.workspace.sidadiya;

import com.workspace.sidadiya.R;

import android.os.Bundle;

import android.app.Activity;
import android.content.Intent;
import android.content.Context;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_screen);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void run() {
        // This method will be executed once the timer is over
        // Start your app main activity
        Intent i = new Intent(MainActivity.this, WelcomeScreen.class);
        startActivity(i);

        // close this activity
        finish();
    }
	
	
	
}
