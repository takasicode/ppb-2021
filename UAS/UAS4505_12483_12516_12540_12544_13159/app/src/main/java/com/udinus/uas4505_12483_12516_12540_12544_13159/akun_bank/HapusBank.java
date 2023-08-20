package com.udinus.uas4505_12483_12516_12540_12544_13159.akun_bank;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class HapusBank extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hapus_bank);

        getSupportActionBar().setTitle("Rekening Bank");
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

    public void hapus(View view) {
        Intent i = new Intent(HapusBank.this, AkunBank.class);
        startActivity(i);
    }
}