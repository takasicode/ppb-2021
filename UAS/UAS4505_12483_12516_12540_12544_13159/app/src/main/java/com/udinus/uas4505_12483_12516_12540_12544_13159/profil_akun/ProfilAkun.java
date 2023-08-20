package com.udinus.uas4505_12483_12516_12540_12544_13159.profil_akun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.udinus.uas4505_12483_12516_12540_12544_13159.Login;
import com.udinus.uas4505_12483_12516_12540_12544_13159.R;
import com.udinus.uas4505_12483_12516_12540_12544_13159.akun_bank.AkunBank;
import com.udinus.uas4505_12483_12516_12540_12544_13159.alamat_saya.AlamatSaya;
import com.udinus.uas4505_12483_12516_12540_12544_13159.edit_profile.EditProfile;
import com.udinus.uas4505_12483_12516_12540_12544_13159.faq.Faq;
import com.udinus.uas4505_12483_12516_12540_12544_13159.hapus_akun.HapusAkun;
import com.udinus.uas4505_12483_12516_12540_12544_13159.tentang_kami.TentangKami;

public class ProfilAkun extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_akun);

        getSupportActionBar().setTitle("Profil");
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

    public void editProfile(View view){
        Intent i = new Intent(ProfilAkun.this, EditProfile.class);
        startActivity(i);
    }

    public void alamatSaya(View view){
        Intent i = new Intent(ProfilAkun.this, AlamatSaya.class);
        startActivity(i);
    }

    public void akunBank(View view){
        Intent i = new Intent(ProfilAkun.this, AkunBank.class);
        startActivity(i);
    }

    public void faq(View view){
        Intent i = new Intent(ProfilAkun.this, Faq.class);
        startActivity(i);
    }

    public void tentangKami(View view){
        Intent i = new Intent(ProfilAkun.this, TentangKami.class);
        startActivity(i);
    }

    public void hapusAkun(View view){
        Intent i = new Intent(ProfilAkun.this, HapusAkun.class);
        startActivity(i);
    }

    public void keluarAkun(View view){
        Intent i = new Intent(ProfilAkun.this, Login.class);
        startActivity(i);
    }

}