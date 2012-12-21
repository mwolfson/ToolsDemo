package com.tools.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class LogcatDemoActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initializeViews();
	}

	private void initializeViews() {
		setContentView(R.layout.logcatdemo);
		
		//Generate a bunch of different logcat messages
		Log.v("ToolsDemo", "Verbose");
		Log.d("ToolsDemo", "Debug");
		Log.i("ToolsDemo", "Info");
		Log.w("ToolsDemo", "Warning");
		Log.e("ToolsDemo", "Error");
		Log.v("ToolsDemo1", "Log statement   1");
		Log.v("ToolsDemo2", "Log statement   2");
		Log.v("ToolsDemo3", "Log statement   3");
		Log.v("ToolsDemoX", "Log statement   X");
		Log.v("ToolsDemoY", "Log statement   Y");
		Log.v("ToolsDemo$", "Log statement   $");
		Log.v("mytag", "jhadfkjhasdf");
		
		
	}
}
