package com.udinus.a4505_a11202012544_muhammadfadhilabyansyah_utsppb;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class InputSKSActivity extends AppCompatActivity {

    ActionBar actionBar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_input_sks);
            RecyclerView daftarKRS = (RecyclerView) findViewById(R.id.daftarKRS);

            daftarKRS.setLayoutManager(new LinearLayoutManager(this));
            String[] krs = {"Kalkulus 1","Fisika 1","Dasar Pemrograman","Bahasa Inggris","Pendidikan Agama Islam", "Pengantar teknologi informasi","Dasar-Dasar Komputasi",
                    "Kalkulus 2","Fisika 2","Algoritma dan Pemrograman","Rangkaian Logika Digital","Bahasa Indonesia","Dasar Kewirausahaan","Pendidikan Pancasila",
                    "Matematika Diskrit","Matriks dan Ruang Vektor","Struktur Data","Pemrograman Berbasis Web","Organisasi dan Arsitektur Komputer","Jaringan Komputer","Pemrograman Perangkat Bergerak","Pendidikan Kewarganegaraan",

                    "Basis Data","Logika Informatika","Pemrograman Web Lanjut","Rekayasa Perangkat Lunak",
                    "Pengelola Citra Digital","Rekayasa Perangkat Lunak Lanjut","Sistem Basis Data","Sistem Informasi","Strategi Algoritma",
                    "Data Mining","Kecerdasan Buatan","Otomata & Teori Bahasa","Pemrograman Berorientasi Objek","Probabolitas & Statistik","Proyek Perangkat Lunak","Sistem Operasi",
                    "Etika Profesi","Komputer Grafik","Literasi Informasi","Manajemen Proyek",
                    "Analitika Media Sosial","Fotografi Desain","Interaksi Manusia dan komputer","Komunikasi Visual Periklanan","Kriptografi","Metodologi Penelitian","Object Oriented Analysis and Design","Pengelolah Citra Digital Lanjut","Perencanaan Strategi Sistem Informasi","Riset Operasi","Sistem Terdistribusi","Software Requirement Engineering","Wireless and Mobile Computing",
                    "Bimbingan Karier","Game Programing","Kerja Praktek","Metode Numerik","Network Management","Pemodelan dan Simulasi","Sistem Temu Kembali Informasi","Software Qualiy and Testing","Technopreneurship","Tugas Akhir 1","Tugas Akhir 2"};
            daftarKRS.setAdapter(new AdapterKRS(krs));

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
}