package com.hps.mobuyle.core;

import android.app.Activity;
import android.os.Bundle;

import org.androidannotations.annotations.EActivity;

@EActivity
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
