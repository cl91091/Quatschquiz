package com.example.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
	MediaPlayer startSong;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
/*		
 * 		//MP3File mit dem Namen splashsound in den raw Ordner einfügen! onPause() aktivieren!
 * 		startSong = MediaPlayer.creat(Splash.this, R.raw.splashsound);
 * 		startSong.start();
 */
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(3000);
				} catch (InterruptedException e){
					e.printStackTrace();
				} finally {
					Intent weiterleitung = new Intent("com.example.quizapp.MAINACTIVITY");
					startActivity(weiterleitung);
				}
			}
		};
		timer.start();
	}
	
/*	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		startSong.release();
		finish();
	}
*/
	
}
