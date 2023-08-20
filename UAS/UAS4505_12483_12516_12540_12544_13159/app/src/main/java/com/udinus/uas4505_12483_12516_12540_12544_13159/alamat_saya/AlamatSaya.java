package com.udinus.uas4505_12483_12516_12540_12544_13159.alamat_saya;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class AlamatSaya extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alamat_saya);

        getSupportActionBar().setTitle("Alamat Saya");
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

    public void lihatMaps(View view) {
        Intent i = new Intent(AlamatSaya.this, MapsActivity.class);
        startActivity(i);
    }
}