package com.udinus.uas4505_12483_12516_12540_12544_13159.akun_bank;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class TambahBank extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_bank);

        getSupportActionBar().setTitle("Tambah Rekening Bank");
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

    public void simpan(View view) {
        Intent i = new Intent(TambahBank.this, AkunBank.class);
        startActivity(i);
    }
}