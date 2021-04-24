package com.example.railinfo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class TrainsActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trains);
		final WebView view = (WebView) findViewById(R.id.WebView);
		view.loadUrl("http://www.indianrail.gov.in/enquiry/TBIS/TrainBetweenImportantStations.html?locale=en ");
	}
}
