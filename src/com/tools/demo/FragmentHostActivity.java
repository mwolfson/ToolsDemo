package com.tools.demo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class FragmentHostActivity extends FragmentActivity {
    private DemoFragment fragment;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_host);
        // find the fragment
        fragment = (DemoFragment) getSupportFragmentManager().findFragmentById(R.id.demo_fragment);
        fragment.setTitleText(getString(R.string.fragmenthostactivity));
        fragment.setButtonText("Launch DemoActivity1");
    }
}