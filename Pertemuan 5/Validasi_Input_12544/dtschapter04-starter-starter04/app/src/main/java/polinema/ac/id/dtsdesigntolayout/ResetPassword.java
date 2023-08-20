package polinema.ac.id.dtsdesigntolayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    // Deklarasi EditText
    EditText editTextResetpassword;
    EditText editTextNewpassword;
    EditText editTextConfirmpassword;
    final int MIN_RESETCODE_LENGHT = 6;
    final int MAX_RESETCODE_LENGHT = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        // Binding EditText
        editTextResetpassword = findViewById(R.id.edt_txt_code);
        editTextNewpassword = findViewById(R.id.edt_new_password);
        editTextConfirmpassword = findViewById(R.id.edt_confirm_password);

    }
    public boolean validateInput() {
        if (TextUtils.isEmpty(editTextResetpassword.getText().toString().trim())
                && TextUtils.isEmpty(editTextNewpassword.getText().toString().trim())
                && TextUtils.isEmpty(editTextConfirmpassword.getText().toString().trim())) {
            Toast.makeText(getApplicationContext(), "Wajib Isi", Toast.LENGTH_SHORT).show();
            editTextResetpassword.setError("Isi Reset Code");
            editTextNewpassword.setError("Isi Password");
            editTextConfirmpassword.setError("Isi Confirm Password");
            return false;
        } else if (TextUtils.isEmpty(editTextResetpassword.getText().toString().trim())) {
            editTextResetpassword.setError("Isi Reset Code");
            return false;
        } else if (TextUtils.isEmpty(editTextNewpassword.getText().toString().trim())
                && TextUtils.isEmpty(editTextConfirmpassword.getText().toString().trim())) {
            editTextNewpassword.setError("Isi Password");
            editTextConfirmpassword.setError("Isi Confirm Password");
            return false;
        } else if (TextUtils.isEmpty(editTextNewpassword.getText().toString().trim())) {
            editTextNewpassword.setError("Isi Password");
            return false;
        } else if (TextUtils.isEmpty(editTextConfirmpassword.getText().toString().trim())) {
            editTextConfirmpassword.setError("Isi Confirm Password");
            return false;
        } else if (editTextResetpassword.getText().length() < MIN_RESETCODE_LENGHT) {
            editTextResetpassword.setError("Reset Code adalah 6 karakter");
            return false;
        } else if (editTextResetpassword.getText().length() > MAX_RESETCODE_LENGHT) {
            editTextResetpassword.setError("Reset Code adalah 6 karakter");
            return false;
        } else if (!editTextConfirmpassword.getText().toString().equals(editTextNewpassword.getText().toString())) {
            editTextConfirmpassword.setError("Password Tidak Sama");
            Toast.makeText(getApplicationContext(), "Password Tidak Valid", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;

    }

    public void postChangePassword(View view) {
        // Validasi kosong
        if(validateInput()) {

        // Cek inputan new dan confirm
        Intent i = new Intent(ResetPassword.this, SuccessActivity.class);
        startActivity(i);
        }

    }
}
