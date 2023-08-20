package com.udinus.a4505_a11202012544_muhammadfadhilabyansyah_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        getSupportActionBar().hide();

        new Handler().postDelayed (new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashscreenActivity.this, Slide1Activity.class);
                startActivity(i);
                finish();
            }
        }, 4000);
    }
}
