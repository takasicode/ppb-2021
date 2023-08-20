package com.udinus.uas4505_12483_12516_12540_12544_13159;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Keranjang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keranjang);

        getSupportActionBar().setTitle("Keranjang Belanja");

    }

    public void CheckOut(View view){
        Intent i = new Intent(Keranjang.this, Transactions.class);
        startActivity(i);
    }
}