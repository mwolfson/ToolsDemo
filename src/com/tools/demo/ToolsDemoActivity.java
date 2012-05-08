package com.tools.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToolsDemoActivity extends Activity {
	private Button uiDemo = null;
	private Button memDemo = null;
	private Button logcatDemo = null;
	private Button imageDemo = null;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        uiDemo = (Button) findViewById(R.id.ui_demo_btn);
        memDemo = (Button) findViewById(R.id.memory_demo_btn);
        logcatDemo = (Button) findViewById(R.id.logcat_demo_btn);
        imageDemo = (Button) findViewById(R.id.img_demo_btn);
        
        uiDemo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), UIDemoActivity.class);
                startActivity(i);
            }
        });
        
        memDemo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), MemDemoActivity.class);
                startActivity(i);
            }
        });
        
        logcatDemo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), LogcatDemoActivity.class);
                startActivity(i);
            }
        });
        
        imageDemo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), ImagesDemoActivity.class);
                startActivity(i);
            }
        });
    }
}