package com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_wanita;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class FashionWanita extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion_wanita);

        getSupportActionBar().setTitle("Fashion Wanita");
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

    public void tasWanita(View view){
        Intent i = new Intent(FashionWanita.this, ProductTasWanita.class);
        startActivity(i);
    }

    public void sepatuSneakers(View view){
        Intent i = new Intent(FashionWanita.this, ProductSepatuSneakersWanita.class);
        startActivity(i);
    }
}