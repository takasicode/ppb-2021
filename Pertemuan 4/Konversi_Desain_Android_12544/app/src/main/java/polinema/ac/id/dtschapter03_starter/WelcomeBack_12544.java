package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeBack_12544 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back12544);
    }

    public void clckForgot (View view){
        Intent i = new Intent(WelcomeBack_12544.this, SuccessActivity_12544.class);
        startActivity(i);
    }
    public void postLogin (View view){
        Intent i = new Intent(WelcomeBack_12544.this, SuccessActivity_12544.class);
        startActivity(i);
    }
}