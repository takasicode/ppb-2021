package com.udinus.uas4505_12483_12516_12540_12544_13159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_anak.DetailProduct_Tas;
import com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_pria.DetailProduct_Hoodie;
import com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_wanita.DetailProduct_Tas_Wanita;
import com.udinus.uas4505_12483_12516_12540_12544_13159.profil_akun.ProfilAkun;
import com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_anak.FashionAnak;
import com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_pria.FashionPria;
import com.udinus.uas4505_12483_12516_12540_12544_13159.fashion_wanita.FashionWanita;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

    }

    public void keranjang(View view){
        Intent i = new Intent(Home.this, Keranjang.class);
        startActivity(i);
    }

    public void tampilanSetting(View view){
        Intent i = new Intent(Home.this, ProfilAkun.class);
        startActivity(i);
    }

    public void klikFashionPria(View view){
        Intent i = new Intent(Home.this, FashionPria.class);
        startActivity(i);
    }

    public void klikFashionWanita(View view){
        Intent i = new Intent(Home.this, FashionWanita.class);
        startActivity(i);
    }

    public void klikFashionAnak(View view){
        Intent i = new Intent(Home.this, FashionAnak.class);
        startActivity(i);
    }

    public void detail(View view){
        Intent i = new Intent(Home.this, DetailProduct_Hoodie.class);
        startActivity(i);
    }

    public void detail2(View view){
        Intent i = new Intent(Home.this, DetailProduct_Tas_Wanita.class);
        startActivity(i);
    }

    public void detail3(View view){
        Intent i = new Intent(Home.this, DetailProduct_Tas.class);
        startActivity(i);
    }
}
