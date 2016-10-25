package com.hps.mobuyle.core;

import android.os.Bundle;
import android.app.Activity;

@EActivity
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
