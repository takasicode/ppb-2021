package com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_anak;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class FashionAnak extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion_anak);

        getSupportActionBar().setTitle("Fashion Anak");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void tassekolah(View view){
        Intent i = new Intent(FashionAnak.this, ProductTas.class);
        startActivity(i);
    }

    public void sepatu(View view){
        Intent i = new Intent(FashionAnak.this, ProductSepatu.class);
        startActivity(i);
    }
}