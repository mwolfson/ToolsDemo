package com.tools.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DebugDemoActivity extends Activity {
    private TextView tv; 
    private EditText et;
    private Button btn;
	
    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.debug_layout);
		tv = (TextView) findViewById(R.id.debug_textview);
	    et = (EditText) findViewById(R.id.debug_edittext);
	    btn = (Button) findViewById(R.id.debug_button);
		
		btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
			    String entered = et.getText().toString();
			    tv.setText(entered);
			}
		});
	}

}
