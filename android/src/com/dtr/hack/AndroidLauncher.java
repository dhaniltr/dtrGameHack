package com.dtr.hack;

import android.os.Bundle;
import android.util.Log;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.dtr.hack.MainActivity;

public class AndroidLauncher extends AndroidApplication {
	private final String TAG =  AndroidLauncher.this.getClass().getSimpleName();
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new MainActivity(), config);
		Log.i(TAG, "onCreate: ");
	}
}
