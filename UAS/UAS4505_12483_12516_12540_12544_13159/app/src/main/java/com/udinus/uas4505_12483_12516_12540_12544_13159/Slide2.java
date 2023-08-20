package com.udinus.uas4505_12483_12516_12540_12544_13159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Slide2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);

        getSupportActionBar().hide();

    }

    public void slide1(View view){
        Intent i = new Intent(Slide2.this, Slide1.class);
        startActivity(i);
    }

    public void slide3(View view){
        Intent i = new Intent(Slide2.this, Slide3.class);
        startActivity(i);
    }
}