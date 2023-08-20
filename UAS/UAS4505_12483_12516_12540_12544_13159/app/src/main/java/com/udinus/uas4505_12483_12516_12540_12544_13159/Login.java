package com.udinus.uas4505_12483_12516_12540_12544_13159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        editTextEmail = findViewById(R.id.edt_txt_email);
        editTextPassword = findViewById(R.id.edt_txt_kata_sandi);

    }

    public void lupa(View view){
        Intent i = new Intent(Login.this, ConfirmEmail.class);
        startActivity(i);
    }
    public void daftar(View view){
        Intent i = new Intent(Login.this, Register.class);
        startActivity(i);
    }
    public void masuk(View view) {
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())
                &&
                TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email dan Kata Sandi Tidak Boleh Kosong!",Toast.LENGTH_LONG).show();
            editTextEmail.setError("Email Tidak Boleh Kosong!");
            editTextPassword.setError("Kata Sandi Tidak Boleh Kosong!");
        }

        else if(!isValidEmail(editTextEmail.getText().toString().trim())){
            editTextEmail.setError("Email Tidak Valid!");
            Toast.makeText(view.getContext(),"Email Tidak Valid!", Toast.LENGTH_LONG).show();
        }

        else if (TextUtils.isEmpty(editTextEmail.getText().toString())){
            editTextEmail.setError("Email Tidak Boleh Kosong!");
            Toast.makeText(view.getContext(), "Email Wajib Diisi", Toast.LENGTH_LONG).show();
        }

        else if (TextUtils.isEmpty(editTextPassword.getText().toString())){
            editTextPassword.setError("Kata Sandi Tidak Boleh Kosong!");
            Toast.makeText(view.getContext(), "Kata Sandi Wajib Diisi", Toast.LENGTH_LONG).show();
        }

        else if (editTextPassword.length() < 8){
            editTextPassword.setError("Minimal 8 Karakter");
            Toast.makeText(view.getContext(),"Kata Sandi Tidak Boleh Kurang dari 8",Toast.LENGTH_LONG).show();
        }

        else {
            Intent i = new Intent(Login.this, Home.class);
            startActivity(i);
        }

    }

    public static boolean isValidEmail (CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}