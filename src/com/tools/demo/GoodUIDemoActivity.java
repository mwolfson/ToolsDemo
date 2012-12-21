package com.tools.demo;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GoodUIDemoActivity extends Activity {
	private boolean DEVELOPER_MODE = true;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    if (DEVELOPER_MODE) 
	    	StrictMode.enableDefaults(); 
	    super.onCreate(savedInstanceState);
		initializeViews();
	}

	private void initializeViews() {
		setContentView(R.layout.gooduidemo);
		
		Button onUiButton = (Button) findViewById(R.id.on_ui_btn);
		Button offUiButton = (Button) findViewById(R.id.off_ui_btn);
		
		onUiButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	doStuffOnUI();
            }
        });
		
		offUiButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	new DoStuffOffUITask().execute();
            }
        });
	}

	
	private void doStuffOnUI() {
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
		SharedPreferences.Editor editor = prefs.edit();
		editor.putString("SamplePref", "setting");
		editor.commit();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			Log.v("ToolsDemo", "Exception" + e, e);
		}

		Toast toast = Toast.makeText(this, "Done with UI Thread - ON", Toast.LENGTH_LONG);
		toast.show();
	}
	
	/**
	 * Do something off the UI thread
	 * 
	 */
	private class DoStuffOffUITask extends AsyncTask<Void, Void, Integer> {

		protected void onPreExecute() {
		}

		@Override
		protected Integer doInBackground(Void... params) {
			SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
			SharedPreferences.Editor editor = prefs.edit();
			editor.putString("SamplePref", "setting");
			editor.commit(); 
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				Log.v("ToolsDemo", "Exception" + e, e);
			}
			return 0;
		}

		protected void onPostExecute(Integer result) {			
			Toast toast = Toast.makeText(getApplicationContext(), "Done with UI Thread - OFF", Toast.LENGTH_LONG);
			toast.show();
		}

	}
}
