package com.udinus.uas4505_12483_12516_12540_12544_13159;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ConfirmEmail extends AppCompatActivity {

    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_email);

        getSupportActionBar().hide();

        editTextEmail = findViewById(R.id.edt_code);

    }

    public void keCode(View view) {
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(),"Email Wajib Isi",Toast.LENGTH_LONG).show();
            editTextEmail.setError("Email Tidak Boleh Kosong!");
        }

        else if(!isValidEmail(editTextEmail.getText().toString().trim())){
            editTextEmail.setError("Email Tidak Valid!");
            Toast.makeText(view.getContext(),"Email Tidak Valid", Toast.LENGTH_LONG).show();
        }

        else {
            Intent i = new Intent(ConfirmEmail.this, Code_Reset.class);
            startActivity(i);
        }

    }

    public static boolean isValidEmail (CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
