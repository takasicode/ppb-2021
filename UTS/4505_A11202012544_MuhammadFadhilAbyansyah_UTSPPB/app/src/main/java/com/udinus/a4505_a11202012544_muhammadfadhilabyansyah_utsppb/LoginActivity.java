package com.udinus.a4505_a11202012544_muhammadfadhilabyansyah_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editTextEmail;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        editTextEmail = findViewById(R.id.edt_txt_email);
        editTextPassword = findViewById(R.id.edt_txt_password);

    }

    public void klikLupa(View view) {
        Intent i = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        startActivity(i);
    }

    public void klikLanjut(View view) {
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())
                &&
                TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email dan Kata Sandi Tidak Boleh Kosong!",Toast.LENGTH_LONG).show();
        }

        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email Tidak Boleh Kosong!", Toast.LENGTH_LONG).show();
        }

        if(TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Kata Sandi Tidak Boleh Kosong!", Toast.LENGTH_LONG).show();
        }

        else if(!isValidEmail(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email Tidak Valid", Toast.LENGTH_LONG).show();
        }

        else if (TextUtils.isEmpty(editTextPassword.getText().toString())) {
            Toast.makeText(view.getContext(), "Kata Sandi Tidak Boleh Kosong!", Toast.LENGTH_LONG).show();
        }

        else {
            Intent i = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(i);
        }
    }

    public static boolean isValidEmail (CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}