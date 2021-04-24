package com.example.railinfo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class PnrActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pnr);
		final WebView view = (WebView) findViewById(R.id.WebView);
		view.loadUrl("http://www.indianrail.gov.in/enquiry/PNR/PnrEnquiry.html?locale=en");
	}
}
