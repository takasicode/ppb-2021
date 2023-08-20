package com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_pria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.uas4505_12483_12516_12540_12544_13159.Home;
import com.udinus.uas4505_12483_12516_12540_12544_13159.Keranjang;
import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class ProductSepatuCasual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_sepatu_casual);

        getSupportActionBar().hide();

    }

    public void product1(View view){
        Intent i = new Intent(ProductSepatuCasual.this, Home.class);
        startActivity(i);
    }

    public void product2(View view){
        Intent i = new Intent(ProductSepatuCasual.this, Home.class);
        startActivity(i);
    }

    public void keranjang(View view){
        Intent i = new Intent(ProductSepatuCasual.this, Keranjang.class);
        startActivity(i);
    }

    public void kembali(View view){
        Intent i = new Intent(ProductSepatuCasual.this, FashionPria.class);
        startActivity(i);
    }
}