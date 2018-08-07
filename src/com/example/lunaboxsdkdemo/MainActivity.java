package com.example.lunaboxsdkdemo;

import com.lunabox.sdk.api.LunaboxPlatform;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	private LunaboxPlatform lbSdk;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lbSdk = LunaboxPlatform.initialize(this, 100, "appKey_wanglaian");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		lbSdk.destory(this);
	}
}
