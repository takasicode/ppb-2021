package com.udinus.uas4505_12483_12516_12540_12544_13159.akun_bank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class AkunBank extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun_bank);

        getSupportActionBar().setTitle("Akun Bank");
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

    public void hapusRek(View view) {
        Intent i = new Intent(AkunBank.this, HapusBank.class);
        startActivity(i);
    }

    public void tambahRek(View view) {
        Intent i = new Intent(AkunBank.this, TambahBank.class);
        startActivity(i);
    }
}