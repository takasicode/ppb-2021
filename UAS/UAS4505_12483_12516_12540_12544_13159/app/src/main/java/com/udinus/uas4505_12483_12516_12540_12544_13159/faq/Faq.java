package com.udinus.uas4505_12483_12516_12540_12544_13159.faq;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

import java.util.ArrayList;
import java.util.List;

public class Faq extends AppCompatActivity {

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        getSupportActionBar().setTitle("Faq");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ListView listView = findViewById(R.id.listview);

        List<String> list = new ArrayList<>();
        list.add("Bagaimana cara saya bisa pesan tanpa akun di aplikasi ini?");
        list.add("Bagaimana cara saya memesan di aplikasi ini?");
        list.add("Bagaimana cara membatalkan pesanan?");
        list.add("Mengapa saya tidak bisa checkout pesanan?");
        list.add("Apakah boleh membatalkan pesanan yang telah masuk proses pengiriman?");
        list.add("Bagaimana cara menyampaikan saran dan kritik?");
        list.add("Bagaimana saya melihat alasan pembatalan pesanan?");
        list.add("Bagaimana saya mengetahui bahwa permintaan pembatalan saya disetujui?");
        list.add("Saya tidak sengaja memesan produk yang sama. Dapatkah saya batalkan salah satunya?");
        list.add("Apakah saya menerima konfirmasi setelah melakukan pemesanan?");
        list.add("Bagaimana menghapus barang dalam keranjang?");
        list.add("Bagaimana cara mengubah alamat pengirriman / nomor telepon / penerima untuk pesanan saya?");
        list.add("Bagaimana cara untuk membatalkan pesanan COD?");
        list.add("Apakah bisa menggunakan sistem COD?");
        list.add("Bagaimana saya melihat alasan pembatalan pesanan?");
        list.add("Dapatkah saya membatalkan pesanan dan membuat pesanan abru dengan menggunakan voucer");
        list.add("Apakah aman berbelanja di aplikasi ini?");
        list.add("Apa itu kebijakan aplikasi ini?");


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    //klik faq 1
                    startActivity(new Intent(Faq.this,Faq1.class));

                }else if(position==1){
                    //klik faq 2
                    startActivity(new Intent(Faq.this,Faq2.class));
                }else{

                }
            }
        });
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