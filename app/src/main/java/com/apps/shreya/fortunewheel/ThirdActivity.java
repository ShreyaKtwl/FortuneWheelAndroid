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

public class ThirdActivity extends AppCompatActivity {

    Button button2;
    ImageView yeswheel;

    Random r1;
    int degree1 = 0, degree_old1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.apps.shreya.fortunewheel.R.layout.activity_third);

        button2 = (Button) findViewById(com.apps.shreya.fortunewheel.R.id.button2);
        yeswheel = (ImageView) findViewById(com.apps.shreya.fortunewheel.R.id.yeswheel);

        r1 = new Random();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                degree_old1 = degree1 % 360;
                degree1 = r1.nextInt(3600) + 720;
                RotateAnimation rotate = new RotateAnimation(degree_old1, degree1,
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

                yeswheel.startAnimation(rotate);


            }
        });


    }
}