package com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_pria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class FashionPria extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion_pria);

        getSupportActionBar().setTitle("Fashion Pria");
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

    public void hoodie(View view){
        Intent i = new Intent(FashionPria.this, ProductHoodie.class);
        startActivity(i);
    }

    public void kaos(View view){
        Intent i = new Intent(FashionPria.this, ProductKaos.class);
        startActivity(i);
    }

    public void sepatuCasual(View view){
        Intent i = new Intent(FashionPria.this, ProductSepatuCasual.class);
        startActivity(i);
    }

    public void sepatuFormal(View view){
        Intent i = new Intent(FashionPria.this, ProductSepatuFormal.class);
        startActivity(i);
    }

    public void topiPria(View view){
        Intent i = new Intent(FashionPria.this, ProductTopi.class);
        startActivity(i);
    }

    public void jamTangan(View view){
        Intent i = new Intent(FashionPria.this, ProductJamTangan.class);
        startActivity(i);
    }
}