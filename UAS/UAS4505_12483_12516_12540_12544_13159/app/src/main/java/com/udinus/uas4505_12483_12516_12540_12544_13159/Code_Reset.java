package com.udinus.uas4505_12483_12516_12540_12544_13159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Code_Reset extends AppCompatActivity {

    EditText editTextCode;
    final int MIN_RESETCODE_LENGHT = 6;
    final int MAX_RESETCODE_LENGHT = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_reset);

        getSupportActionBar().hide();

        editTextCode = findViewById(R.id.edt_code);

    }

    public boolean validateInput() {
        if (TextUtils.isEmpty(editTextCode.getText().toString().trim())
                && TextUtils.isEmpty(editTextCode.getText().toString().trim())) {
            Toast.makeText(getApplicationContext(), "Wajib Isi Kode", Toast.LENGTH_SHORT).show();
            editTextCode.setError("Kode Tidak Boleh Kosong!");
            return false;
        }

        else if (editTextCode.getText().length() < MIN_RESETCODE_LENGHT) {
            editTextCode.setError("Minimal 6 Kode Karakter");
            Toast.makeText(getApplicationContext(),"Kode Tidak Boleh Kurang dari 8",Toast.LENGTH_LONG).show();
            return false;
        }

        else if (editTextCode.getText().length() > MAX_RESETCODE_LENGHT) {
            editTextCode.setError("Maximal 6 Kode Karakter");
            Toast.makeText(getApplicationContext(),"Kode Tidak Boleh Lebih dari 8",Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }

    public void selanjutnya1(View view) {
        if(validateInput()) {
            Intent i = new Intent(Code_Reset.this, Forgot_Password.class);
            startActivity(i);
        }
    }
}