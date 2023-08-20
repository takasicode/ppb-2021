package com.udinus.sqlite_12544;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText xnim;
    EditText xnama;
    Button tblAdd;
    Button tblView;
//    Button tblDelete;
//    Button tblUpdate;
    DatabaseHelper BantuDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BantuDb = new DatabaseHelper(this);
        xnim = (EditText) findViewById(R.id.xnim);
        xnama = (EditText) findViewById(R.id.xnama);
        tblAdd = (Button) findViewById(R.id.tblAdd);
        tblView = (Button) findViewById(R.id.tblView);
//        tblUpdate = (Button) findViewById(R.id.tblUpdate);
//        tblDelete = (Button) findViewById(R.id.tblDelete);
        viewAll();

        tblAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInsert =
                        BantuDb.insertData(xnim.getText().toString(),xnama.getText().toString());
                if (isInsert == true)
                    Toast.makeText(MainActivity.this, "Data Tersimpan", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "Data Gagal Tersimpan", Toast.LENGTH_LONG).show();
            }
        });

//        tblUpdate.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                boolean isUpdate =
//                        BantuDb.updateData(xnim.getText().toString(), xnama.getText().toString());
//                if (isUpdate == true)
//                    Toast.makeText(MainActivity.this, "Data Berhasil diupdate", Toast.LENGTH_LONG).show();
//                else
//                    Toast.makeText(MainActivity.this, "Data Gagal diupdate", Toast.LENGTH_LONG).show();
//            }
//        });
//
//        tblDelete.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int deleteRows =
//                        BantuDb.deleteData(xnim.getText().toString());
//                if (deleteRows > 0)
//                    Toast.makeText(MainActivity.this, "Data Berhasil dihapus", Toast.LENGTH_LONG).show();
//                else
//                    Toast.makeText(MainActivity.this, "Data Gagal dihapus", Toast.LENGTH_LONG).show();
//            }
//        });
    }

    public void viewAll(){
        tblView.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Cursor res= BantuDb.getAllData();
                        if (res.getCount() == 0){
                            //show message
                            showMessage("Kesalahan", "Tidak ada Data yang ditemukan");
                            return;
                        }
                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()){
                            buffer.append("NIM : " + res.getString(0) + "\n");
                            buffer.append("Nama Mahasiswa : "+ res.getString(1) + "\n \n");
                        }
                        //show All Data
                        showMessage ("Data Mahasiswa", buffer.toString());
                    }
                });
    }

    public void showMessage (String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}