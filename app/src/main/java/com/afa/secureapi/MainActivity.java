package com.afa.secureapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Reference data in build.gradle
        Log.d(TAG, "onCreate: "+BuildConfig.Base_URL);
        Log.d(TAG, "onCreate: "+BuildConfig.SMS_Base_URL);
    }
}