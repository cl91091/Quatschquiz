package com.example.quizapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	Button log;
	Button createAcc;
	TextView anzeige;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		log = (Button) findViewById(R.id.bEinloggen);
		createAcc = (Button) findViewById(R.id.bcreateAcc);
		anzeige = (TextView) findViewById(R.id.textView1);

		log.setOnClickListener(this);
		createAcc.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
	
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onClick(View e) {
		if(e == log){
			startActivity(new Intent(this,SpielMenu.class));
		}

		if (e == createAcc){
			startActivity(new Intent(this,CreateAcc.class));
		}
	}

	
	//Zufallscode generator
	public static String getString(int len, String charSet) {
        String result = "";
        while (result.length() < len) {
            result = result + getChar(charSet);
        }
        return result;
    }
    
    public static char getChar(String charSet) {
        int s = getInt(charSet.length());
        return charSet.charAt(s - 1);
    }
    
    public static int getInt(int max) {
        return (int) (Math.ceil(Math.random() * max));
    }
}
