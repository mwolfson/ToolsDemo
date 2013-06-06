package com.tools.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogcatDemoActivity extends Activity {
    private TextView tv;
    private EditText et;
    private Button btn;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initializeViews();
	}

	private void initializeViews() {
		setContentView(R.layout.logcatdemo);
		
		tv = (TextView) findViewById(R.id.logcat_textview);
        et = (EditText) findViewById(R.id.logcat_edittext);
        btn = (Button) findViewById(R.id.logcat_button);
        
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String entered = et.getText().toString();
                tv.setText(entered);
            }
        });
		
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
