package com.apps.shreya.fortunewheel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
{
    public Button but1;
    public Button but2;

    public void init(){
        but1 = findViewById (com.apps.shreya.fortunewheel.R.id.but1);
        but1.setOnClickListener (new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent two = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(two);
            }
        });
    }

    public void init2(){
        but2 = findViewById(com.apps.shreya.fortunewheel.R.id.but2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent three = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(three);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.apps.shreya.fortunewheel.R.layout.activity_main);
        getSupportActionBar().hide(); //hides top title bar
        init();
        init2();
    }
}

