package com.udinus.uas4505_12483_12516_12540_12544_13159;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Transactions extends AppCompatActivity {

    private EditText editnamapel,editnamabar,editjumlahbar,editharga,edituangbay;
    private Button btnproses;
    private Button btnhapus;
    private Button btnselesai;
    private TextView txtnamapel;
    private TextView txtnamabar;
    private TextView txtjumlahbar;
    private TextView txtharga;
    private TextView txtuangbay;
    private TextView txtbonus;
    private TextView txttotalbelanja;
    private TextView txtkembali;
    private TextView txtketerangan;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transactions);

        getSupportActionBar().setTitle("Pembayaran");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editnamapel = (EditText) findViewById(R.id.namapembeli);
        editnamabar = (EditText) findViewById(R.id.namabarang);
        editjumlahbar = (EditText) findViewById(R.id.jumlahbarang);
        editharga = (EditText) findViewById(R.id.hargabarang);
        edituangbay = (EditText) findViewById(R.id.jumlahuang);

        btnproses = (Button) findViewById(R.id.proses);
        btnhapus = (Button) findViewById(R.id.hapus);
        btnselesai = (Button) findViewById(R.id.selesai);

        txtnamapel = (TextView) findViewById(R.id.namapembeli);
        txtnamabar = (TextView) findViewById(R.id.namabarang);
        txtjumlahbar = (TextView) findViewById(R.id.jumlahbarang);
        txtharga = (TextView) findViewById(R.id.hargabarang);
        txtuangbay = (TextView) findViewById(R.id.jumlahuang);
        txttotalbelanja = (TextView) findViewById(R.id.total);
        txtkembali = (TextView) findViewById(R.id.uangkembali);
        txtketerangan = (TextView) findViewById(R.id.keterangan);
        txtbonus = (TextView) findViewById(R.id.bonus);

        btnproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String namapelanggan = editnamapel.getText().toString().trim();
                String namabarang = editnamabar.getText().toString().trim();
                String jumlahbarang = editjumlahbar.getText().toString().trim();
                String hargabarang = editharga.getText().toString().trim();
                String uangbayar = edituangbay.getText().toString().trim();

                double jb = Double.parseDouble(jumlahbarang);
                double h = Double.parseDouble(hargabarang);
                double ub = Double.parseDouble(uangbayar);
                double total = (jb*h);

                txttotalbelanja.setText("TOTAL BELANJA : "+total);

                if (total >= 250000){txtbonus.setText("BONUS STICKER FASHION SHOP");}
                else if (total >=500000){txtbonus.setText("BONUS MASKER FASHION SHOP");}
                else if (total >=800000){txtbonus.setText("BONUS TOPI FASHION SHOP");}
                else {txtbonus.setText("TIDAK ADA BONUS");}

                double uangkembalian = (ub-total);
                if (ub<total){
                    txtketerangan.setText(" UANG ANDA KURANG -> "+(-uangkembalian));
                    txtkembali.setText("UANG KEMBALIAN Rp.0");
                }else {
                    txtketerangan.setText("TUNGGU UANG KEMBALIANNYA BROOO");
                    txtkembali.setText("UANG KEMBALIAN ->"+uangkembalian);
                }
            }
        });
        btnhapus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtnamapel.setText("");
                txtnamabar.setText("");
                txtjumlahbar.setText("");
                txtharga.setText("");
                txtuangbay.setText("");
                txtkembali.setText("UANG KEMBALI Rp.0");
                txtketerangan.setText("");
                txtbonus.setText("");
                txttotalbelanja.setText("TOTAL BELANJA Rp.0");

                Toast.makeText(getApplicationContext(), "Data sudah dihapus", Toast.LENGTH_LONG).show();
            }
        });
        btnselesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Transactions.this, SuccessTransactions.class);
                startActivity(i);
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