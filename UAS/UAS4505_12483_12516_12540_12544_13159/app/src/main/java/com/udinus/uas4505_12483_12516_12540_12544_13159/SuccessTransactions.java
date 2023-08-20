package com.udinus.uas4505_12483_12516_12540_12544_13159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SuccessTransactions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_transactions);

        getSupportActionBar().hide();

        new Handler() .postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SuccessTransactions.this, Home.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}