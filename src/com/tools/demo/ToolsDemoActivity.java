package com.tools.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToolsDemoActivity extends Activity {
	private Button uiDemo = null;
	private Button goodUiDemo = null;
	private Button memDemo = null;
	private Button logcatDemo = null;
	private Button imageDemo = null;
	private Button fragmentDemo = null;	
	private Button localDemo = null;
	private Button debugDemo = null;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        uiDemo = (Button) findViewById(R.id.ui_demo_btn);
        goodUiDemo = (Button) findViewById(R.id.goodui_demo_btn);
        memDemo = (Button) findViewById(R.id.memory_demo_btn);
        logcatDemo = (Button) findViewById(R.id.logcat_demo_btn);
        imageDemo = (Button) findViewById(R.id.img_demo_btn);
        fragmentDemo = (Button) findViewById(R.id.fragment_demo_btn);
        localDemo = (Button) findViewById(R.id.localization_btn);
        debugDemo = (Button) findViewById(R.id.debug_btn);
         
        uiDemo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), UIDemoActivity.class); 
                startActivity(i);
            }
        });
        
        goodUiDemo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), GoodUIDemoActivity.class);
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
        
        fragmentDemo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), FragmentHostActivity.class);
                startActivity(i);
            }
        });
        
        localDemo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent i = new Intent(getApplicationContext(), LocalizationDemoActivity.class);
                startActivity(i);
            }
        });
        
        debugDemo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DebugDemoActivity.class);
                startActivity(i);
            }
        });
    }
}