package com.apps.shreya.fortunewheel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //To remove the default title bar on the splash screen

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //to make the splash screen fullscreen

        setContentView(com.apps.shreya.fortunewheel.R.layout.activity_splash_screen);
        //must be put below the above 2 lines of code, aka after it has been made fullscreen

        getSupportActionBar().hide(); //to get top title bar to hide

        //to call logo launcher class on create:
        LogoLauncher logoLauncher = new LogoLauncher(); //creates logo launcher object
        logoLauncher.start(); //call logo launcher object

    }

    //A class to lauch the logo:
    private class LogoLauncher extends Thread {
        public void run() {
            try {
                int SLEEP_TIMER = 3;
                sleep(1000 * SLEEP_TIMER); //to display screen for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            //to move from one activity to another
            startActivity(intent);
            SplashScreenActivity.this.finish();
            //stopping activity so the splash screen doesn't reappear
            // from main activity when back is pressed
        }


    }
}