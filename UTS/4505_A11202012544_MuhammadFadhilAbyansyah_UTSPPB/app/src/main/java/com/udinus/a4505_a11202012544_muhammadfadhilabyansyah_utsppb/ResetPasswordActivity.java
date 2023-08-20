package com.udinus.a4505_a11202012544_muhammadfadhilabyansyah_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPasswordActivity extends AppCompatActivity {

    EditText editTextResetpassword;
    EditText editTextNewpassword;
    EditText editTextConfirmpassword;
    final int MIN_RESETCODE_LENGHT = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        getSupportActionBar().hide();

        editTextResetpassword = findViewById(R.id.edt_txt_kode);
        editTextNewpassword = findViewById(R.id.edt_kata_sandi_baru);
        editTextConfirmpassword = findViewById(R.id.edt_konfirmasi_kata_sandi);

    }
    public boolean validateInput() {
        if(TextUtils.isEmpty(editTextResetpassword.getText().toString().trim())
                && TextUtils.isEmpty(editTextNewpassword.getText().toString().trim())
                && TextUtils.isEmpty(editTextConfirmpassword.getText().toString().trim())) {
            Toast.makeText(getApplicationContext(), "Wajib Isi", Toast.LENGTH_SHORT).show();
            editTextResetpassword.setError("Isi Kode");
            editTextNewpassword.setError("Isi Kata Sandi");
            editTextConfirmpassword.setError("Isi Ulang Kata Sandi");
            return false;
        } else if (TextUtils.isEmpty(editTextResetpassword.getText().toString().trim())) {
            editTextResetpassword.setError("Isi Kode");
            return false;
        } else if (TextUtils.isEmpty(editTextNewpassword.getText().toString().trim())
                && TextUtils.isEmpty(editTextConfirmpassword.getText().toString().trim())) {
            editTextNewpassword.setError("Isi Kata Sandi");
            editTextConfirmpassword.setError("Isi Ulang Kata Sandi");
            return false;
        } else if (TextUtils.isEmpty(editTextNewpassword.getText().toString().trim())) {
            editTextNewpassword.setError("Isi Kata Sandi");
            return false;
        } else if (TextUtils.isEmpty(editTextConfirmpassword.getText().toString().trim())) {
            editTextConfirmpassword.setError("Isi Ulang Kata Sandi");
            return false;
        } else if (editTextResetpassword.getText().length() < MIN_RESETCODE_LENGHT) {
            editTextResetpassword.setError("Masukan 6 kode karakter");
            return false;
        } else if (!editTextConfirmpassword.getText().toString().equals(editTextNewpassword.getText().toString())) {
            editTextConfirmpassword.setError("Password Tidak Sama");
            Toast.makeText(getApplicationContext(), "Password Tidak Valid", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    public void klikUbahKataSandi(View view) {
        if(validateInput()) {
            Intent i = new Intent(ResetPasswordActivity.this, LoginActivity.class);
            startActivity(i);
        }
    }
}
