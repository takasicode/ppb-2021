package com.udinus.uas4505_12483_12516_12540_12544_13159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Slide3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide3);

        getSupportActionBar().hide();

    }

    public void slide2(View view){
        Intent i = new Intent(Slide3.this, Slide2.class);
        startActivity(i);
    }

    public void get_started(View view){
        Intent i = new Intent(Slide3.this, Welcome.class);
        startActivity(i);
    }
}