package com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_pria;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.uas4505_12483_12516_12540_12544_13159.Keranjang;
import com.udinus.uas4505_12483_12516_12540_12544_13159.R;
import com.udinus.uas4505_12483_12516_12540_12544_13159.Transactions;

public class DetailProduct_Hoodie extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_product_hoodie);

        getSupportActionBar().hide();
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void checkOut(View view){
        Intent i = new Intent(DetailProduct_Hoodie.this, Transactions.class);
        startActivity(i);
    }

    public void keranjang(View view){
        Intent i = new Intent(DetailProduct_Hoodie.this, Keranjang.class);
        startActivity(i);
    }

    public void back(View view){
        Intent i = new Intent(DetailProduct_Hoodie.this, ProductHoodie.class);
        startActivity(i);
    }
}
