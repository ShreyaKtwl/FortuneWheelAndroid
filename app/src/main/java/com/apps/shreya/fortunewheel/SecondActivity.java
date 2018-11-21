package com.apps.shreya.fortunewheel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    Button button1;
    ImageView starwheel;

    Random r;
    int degree = 0, degree_old = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.apps.shreya.fortunewheel.R.layout.activity_second);

        button1 = (Button) findViewById(com.apps.shreya.fortunewheel.R.id.button1);
        starwheel = (ImageView) findViewById(com.apps.shreya.fortunewheel.R.id.starwheel);

        r = new Random();



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                degree_old = degree % 360;
                degree = r.nextInt(3600) + 720;
                RotateAnimation rotate = new RotateAnimation(degree_old, degree,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                        RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(3600);
                rotate.setFillAfter(true);
                rotate.setInterpolator(new DecelerateInterpolator());
                rotate.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });

                starwheel.startAnimation(rotate);


            }
        });

    }
}