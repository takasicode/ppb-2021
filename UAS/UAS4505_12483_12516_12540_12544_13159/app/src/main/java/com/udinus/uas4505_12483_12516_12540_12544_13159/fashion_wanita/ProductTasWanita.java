package com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_wanita;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.uas4505_12483_12516_12540_12544_13159.Home;
import com.udinus.uas4505_12483_12516_12540_12544_13159.Keranjang;
import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class ProductTasWanita extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_tas_wanita);

        getSupportActionBar().hide();
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

    public void product1(View view){
        Intent i = new Intent(ProductTasWanita.this, DetailProduct_Tas_Wanita.class);
        startActivity(i);
    }

    public void product2(View view){
        Intent i = new Intent(ProductTasWanita.this, Home.class);
        startActivity(i);
    }

    public void keranjang(View view){
        Intent i = new Intent(ProductTasWanita.this, Keranjang.class);
        startActivity(i);
    }

    public void kembali(View view){
        Intent i = new Intent(ProductTasWanita.this, FashionWanita.class);
        startActivity(i);
    }
}