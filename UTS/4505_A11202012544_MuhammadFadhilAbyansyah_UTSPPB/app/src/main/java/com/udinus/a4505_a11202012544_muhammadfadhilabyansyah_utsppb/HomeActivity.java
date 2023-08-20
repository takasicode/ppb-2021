package com.udinus.a4505_a11202012544_muhammadfadhilabyansyah_utsppb;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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

    public void klikKRS (View view){
        Intent i = new Intent (HomeActivity.this, SKSActivity.class);
        startActivity(i);
    }
    public void klikInputKRS (View view){
        Intent i = new Intent (HomeActivity.this,InputSKSActivity.class);
        startActivity(i);
    }
    public void klikJadwal (View view){
        Intent i = new Intent (HomeActivity.this, JadwalActivity.class);
        startActivity(i);
    }
    public void klikNilai (View view){
        Intent i = new Intent (HomeActivity.this, NilaiActivity.class);
        startActivity(i);
    }
    public void klikBiayaKuliah(View view){
        Intent i = new Intent (HomeActivity.this, BiayaKuliahActivity.class);
        startActivity(i);
    }
    public void klikIPK (View view){
        Intent i = new Intent (HomeActivity.this, IPKActivity.class);
        startActivity(i);
    }
    public void klikPengumuman (View view){
        Intent i = new Intent (HomeActivity.this, PengumumanActivity.class);
        startActivity(i);
    }
    public void klikKalender (View view){
        Intent i = new Intent (HomeActivity.this, KalenderActivity.class);
        startActivity(i);
    }
    public void klikPrestasi (View view){
        Intent i = new Intent (HomeActivity.this, PrestasiActivity.class);
        startActivity(i);
    }
    public void klikPanduan (View view){
        Intent i = new Intent (HomeActivity.this, PanduanActivity.class);
        startActivity(i);
    }
}