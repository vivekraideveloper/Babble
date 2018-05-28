package com.vijayjaidewan01vivekrai.androidfirebase;

import android.content.Intent;
import android.support.animation.SpringAnimation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class StartActivity extends AppCompatActivity {


    private Button mRegBtn;
    private Button mLoginBtn;
    private ImageView android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);


        mRegBtn = (Button) findViewById(R.id.start_reg_btn);
        mLoginBtn = (Button) findViewById(R.id.start_login_btn);
        android = findViewById(R.id.imageViewandroid);

        SpringAnimation animation = new SpringAnimation(android, SpringAnimation.TRANSLATION_Y, 80);
        animation.getSpring().setDampingRatio(0.8f);
        animation.getSpring().setStiffness(0.8f);
        animation.setStartVelocity(1000f);
        animation.start();

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpringAnimation animation = new SpringAnimation(android, SpringAnimation.TRANSLATION_Y, 80);
                animation.getSpring().setDampingRatio(0.8f);
                animation.getSpring().setStiffness(0.8f);
                animation.setStartVelocity(1200f);
                animation.start();
            }
        });

        mRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent reg_intent = new Intent(StartActivity.this, RegisterActivity.class);
                startActivity(reg_intent);

            }
        });

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent login_intent = new Intent(StartActivity.this, LoginActivity.class);
                startActivity(login_intent);

            }
        });

    }
}

