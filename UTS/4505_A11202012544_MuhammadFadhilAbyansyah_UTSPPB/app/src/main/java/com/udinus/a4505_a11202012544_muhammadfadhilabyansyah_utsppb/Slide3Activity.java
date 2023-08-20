package com.udinus.a4505_a11202012544_muhammadfadhilabyansyah_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Slide3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide3);

        getSupportActionBar().hide();

    }

    public void klikLanjut (View view){
        Intent i = new Intent (Slide3Activity.this, LoginActivity.class);
        startActivity(i);
    }
}