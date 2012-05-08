package com.tools.demo;

import java.util.Vector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MemDemoActivity extends Activity {

	private Button eatMemory;
	private Vector vect;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.memdemo);

		vect = new Vector();
		eatMemory = (Button) this.findViewById(R.id.eat_mem_btn);

		eatMemory.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				byte b[] = new byte[248576];
				vect.add(b);

				Runtime rt = Runtime.getRuntime();
				Log.v("ToolsDemo", "Size of memory is: " + rt.freeMemory());
			}
		});
	}

}
