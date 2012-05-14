package com.tools.demo;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class UIDemoActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initializeViews();
	}

	private void initializeViews() {
		setContentView(R.layout.uidemo);
		
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
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			Log.v("ToolsDemo", "Exception" + e, e);
		}
		Context context = getApplicationContext();
		CharSequence text = "Done with UI Thread - ON";
		int duration = Toast.LENGTH_LONG;

		Toast toast = Toast.makeText(context, text, duration);
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
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				Log.v("ToolsDemo", "Exception" + e, e);
			}
			return 0;
		}

		protected void onPostExecute(Integer result) {
			Context context = getApplicationContext();
			CharSequence text = "Done with UI Thread - OFF";
			int duration = Toast.LENGTH_LONG;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
		}

	}
}
