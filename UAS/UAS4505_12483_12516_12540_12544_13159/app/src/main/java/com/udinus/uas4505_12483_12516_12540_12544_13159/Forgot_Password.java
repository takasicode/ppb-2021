package com.udinus.uas4505_12483_12516_12540_12544_13159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Forgot_Password extends AppCompatActivity {

    EditText editTextPasswordLama;
    EditText editTextPasswordBaru;
    final int MIN_RESETCODE_LENGHT = 8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        getSupportActionBar().hide();

        editTextPasswordLama = findViewById(R.id.password_lama);
        editTextPasswordBaru = findViewById(R.id.password_baru);

    }

    public boolean validateInput() {
        if (TextUtils.isEmpty(editTextPasswordLama.getText().toString().trim())
                && TextUtils.isEmpty(editTextPasswordBaru.getText().toString().trim())) {
            Toast.makeText(getApplicationContext(), "Wajib Isi Kata Sandi", Toast.LENGTH_SHORT).show();
            editTextPasswordLama.setError("Kata Sandi Lama Tidak Boleh Kosong!");
            editTextPasswordBaru.setError("Kata Sandi Baru Tidak Boleh Kosong!");
            return false;
        }

        else if (TextUtils.isEmpty(editTextPasswordLama.getText().toString().trim())) {
            editTextPasswordLama.setError("Kata Sandi Lama Tidak Boleh Kosong!");
            Toast.makeText(getApplicationContext(),"Kata Sandi Lama Wajib Diisi",Toast.LENGTH_LONG).show();
            return false;
        }

        else if (TextUtils.isEmpty(editTextPasswordBaru.getText().toString().trim())) {
            editTextPasswordBaru.setError("Kata Sandi Baru Tidak Boleh Kosong!");
            Toast.makeText(getApplicationContext(),"Kata Sandi Baru Wajib Diisi",Toast.LENGTH_LONG).show();
            return false;
        }

        else if (editTextPasswordBaru.getText().length() < MIN_RESETCODE_LENGHT) {
            editTextPasswordBaru.setError("Minimal 8 Karakter");
            Toast.makeText(getApplicationContext(),"Kata Sandi Baru Tidak Boleh Kurang dari 8",Toast.LENGTH_LONG).show();
            return false;
        }

        return true;

    }

    public void ubah(View view) {
        if(validateInput()) {
            Intent i = new Intent(Forgot_Password.this, Login.class);
            startActivity(i);
        }
    }
}