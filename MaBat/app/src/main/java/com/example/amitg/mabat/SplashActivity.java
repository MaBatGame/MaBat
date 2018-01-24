package com.example.amitg.mabat;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @version 1.0.
 */

public class SplashActivity extends AppCompatActivity {

    private static final short SPLASH_TIME_OUT = (short)2.8 * 1000; //The duration of the splash screen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //TODO if the user signed in.

                if (false){
                    //TODO moving to the main activity.
                }
                else {
                    //Start the sign in activity.
                    Intent intent = new Intent (SplashActivity.this, SignInActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, SPLASH_TIME_OUT);
    }
}
