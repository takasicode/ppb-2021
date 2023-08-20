package com.udinus.uas4505_12483_12516_12540_12544_13159.edit_profile;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class EditProfile extends AppCompatActivity {

    ActionBar actionBar;

    EditText xnamad;
    EditText xnamab;
    EditText xttl;
    EditText xpekerjaan;
    EditText xalamat;
    Button tblAdd;
    DatabaseReference reff;
    Data edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        getSupportActionBar().setTitle("Edit Profil");
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        xnamad=(EditText)findViewById(R.id.xnamad);
        xnamab=(EditText)findViewById(R.id.xnamab);
        xttl=(EditText)findViewById(R.id.xttl);
        xpekerjaan=(EditText)findViewById(R.id.xpekerjaan);
        xalamat=(EditText)findViewById(R.id.xalamat);
        tblAdd=(Button)findViewById(R.id.tblAdd);
        edit = new Data();
        reff = FirebaseDatabase.getInstance().getReference().child("EDIT PROFIL");

        tblAdd.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit.setNamad(xnamad.getText().toString().trim());
                edit.setNamab(xnamab.getText().toString().trim());
                edit.setTtl(xttl.getText().toString().trim());
                edit.setPekerjaan(xpekerjaan.getText().toString().trim());
                edit.setAlamat(xalamat.getText().toString().trim());
                reff.push().setValue(edit);
                Toast.makeText(EditProfile.this, "DATA TERSIMPAN",Toast.LENGTH_LONG).show();
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


    public void showMessage (String title, String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}