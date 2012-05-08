package com.tools.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class UIDemoActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initializeViews();
	}

	private void initializeViews() {
		setContentView(R.layout.uidemo);
	}
}
