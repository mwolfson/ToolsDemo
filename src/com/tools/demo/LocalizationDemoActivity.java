package com.tools.demo;

import java.util.Calendar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class LocalizationDemoActivity extends Activity {

	private TextView imgText;
	private ImageView imgView;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initializeViews(); 
	}

	private void initializeViews() {
		setContentView(R.layout.localization);
		
	}

}
