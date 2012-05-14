package com.tools.demo;

import android.app.Activity;
import android.os.Bundle;
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
	}
}
