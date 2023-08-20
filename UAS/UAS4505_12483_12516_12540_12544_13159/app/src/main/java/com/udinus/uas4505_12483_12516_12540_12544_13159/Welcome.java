package com.udinus.uas4505_12483_12516_12540_12544_13159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        getSupportActionBar().hide();

    }

    public void masuk(View view){
        Intent i = new Intent(Welcome.this, Login.class);
        startActivity(i);
    }

    public void daftar(View view){
        Intent i = new Intent(Welcome.this, Register.class);
        startActivity(i);
    }
}