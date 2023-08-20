package com.example.activity_life_cycle_12544;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText( this, "Aplikasi On Start",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "Aplikasi On Stop",Toast.LENGTH_SHORT).show();
    }
}