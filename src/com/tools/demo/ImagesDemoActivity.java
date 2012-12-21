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

public class ImagesDemoActivity extends Activity {

	private TextView imgText;
	private ImageView imgView;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		initializeViews();
	}

	private void initializeViews() {
		setContentView(R.layout.imagesdemo);
		imgText = (TextView) this.findViewById(R.id.img_demo_text);
		imgView = (ImageView) this.findViewById(R.id.image_demo_imgview);
		imgView.setBackgroundResource(R.drawable.new_image);
		
		sendNotification();
	}

	@SuppressLint("NewApi")
	private void sendNotification() {
		int r = 1236872;
		Intent contentIntent = new Intent(this, ToolsDemoActivity.class);

		Context ctx = this.getBaseContext();
		PendingIntent pi = PendingIntent.getActivity(this.getBaseContext(), r,
				contentIntent, PendingIntent.FLAG_UPDATE_CURRENT);

		Notification n = null;
		NotificationCompat.Builder builder = new NotificationCompat.Builder(ctx);

		builder.setContentIntent(pi).setSmallIcon(R.drawable.notif_icon).setTicker("Tools Demo")
				.setWhen(System.currentTimeMillis()).setAutoCancel(true)
				.setContentTitle("Tools Demo").setContentText("Some comments");
		n = builder.build();

		NotificationManager nm = (NotificationManager) ctx
				.getSystemService(Context.NOTIFICATION_SERVICE);
		nm.notify(2424324, n);
	}
}
