package com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_wanita;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.uas4505_12483_12516_12540_12544_13159.Keranjang;
import com.udinus.uas4505_12483_12516_12540_12544_13159.R;
import com.udinus.uas4505_12483_12516_12540_12544_13159.Transactions;

public class DetailProduct_Tas_Wanita extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product_tas_wanita);

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

    public void checkOut(View view){
        Intent i = new Intent(DetailProduct_Tas_Wanita.this, Transactions.class);
        startActivity(i);
    }

    public void keranjang(View view){
        Intent i = new Intent(DetailProduct_Tas_Wanita.this, Keranjang.class);
        startActivity(i);
    }

    public void back(View view){
        Intent i = new Intent(DetailProduct_Tas_Wanita.this, ProductTasWanita.class);
        startActivity(i);
    }
}