package com.udinus.a4505_a11202012544_muhammadfadhilabyansyah_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPasswordActivity extends AppCompatActivity {

    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        getSupportActionBar().hide();

        editTextEmail = findViewById(R.id.edt_txt_email);
    }

    public void klikKirim(View view) {
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email Tidak boleh Kosong!", Toast.LENGTH_LONG).show();
        }
        else
        if(!isValidEmail(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email Tidak Valid", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent( ForgotPasswordActivity.this, ResetPasswordActivity.class);
            startActivity(i);
        }
    }
    public static boolean isValidEmail (CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
