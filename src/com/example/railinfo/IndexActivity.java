package com.example.railinfo;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class IndexActivity extends TabActivity{
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);
		TabHost tabhost = (TabHost)findViewById(android.R.id.tabhost);
		
		
		TabSpec tab1 = tabhost.newTabSpec("pnr");
		tab1.setIndicator("PNR Enquiry");
		tab1.setContent(new Intent(IndexActivity.this,PnrActivity.class));
		tabhost.addTab(tab1);
		TabSpec tab2 = tabhost.newTabSpec("Trains");
		tab2.setIndicator("Trains available");
		tab2.setContent(new Intent(IndexActivity.this,TrainsActivity.class));
		tabhost.addTab(tab2);
		TabSpec tab3 = tabhost.newTabSpec("catering");
		tab3.setIndicator("e-Catering");
		tab3.setContent(new Intent(IndexActivity.this,CateringActivity.class));
		tabhost.addTab(tab3);
		TabSpec tab4 = tabhost.newTabSpec("Book");
		tab4.setIndicator("Book Tickets");
		tab4.setContent(new Intent(IndexActivity.this,BookActivity.class));
		tabhost.addTab(tab4);
		TabSpec tab5 = tabhost.newTabSpec("runnnig");
		tab5.setIndicator("Train Running status");
		tab5.setContent(new Intent(IndexActivity.this,RunActivity.class));
		tabhost.addTab(tab5);
		
	}
}
