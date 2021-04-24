package com.example.railinfo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class RunActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_run);
		final WebView view = (WebView) findViewById(R.id.WebView);
		view.loadUrl("https://www.railyatri.in/live-train-status");
	}
}
