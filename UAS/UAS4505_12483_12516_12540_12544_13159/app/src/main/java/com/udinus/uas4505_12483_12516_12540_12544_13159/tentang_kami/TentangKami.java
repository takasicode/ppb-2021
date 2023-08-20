package com.udinus.uas4505_12483_12516_12540_12544_13159.tentang_kami;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class TentangKami extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_kami);

        RecyclerView daftarKelompok= (RecyclerView) findViewById(R.id.daftarKelompok);

        daftarKelompok.setLayoutManager(new LinearLayoutManager(this));
        String[] nama = {"Fajarujin Zakariya","Gibran Nasrizal Masacgi","Achmad Aria Reza","Muhammad Fadhil Abyansyah","Khaliq Pradana"};
        daftarKelompok.setAdapter(new Adapter(nama));

        getSupportActionBar().setTitle("Tentang Kami");
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