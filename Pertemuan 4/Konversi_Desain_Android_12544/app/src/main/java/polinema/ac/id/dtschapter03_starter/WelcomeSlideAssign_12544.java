package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeSlideAssign_12544 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_assign12544);
    }

    public void clickGetStarted (View view){
        Intent i = new Intent(WelcomeSlideAssign_12544.this, WelcomeSlideSuperhero_12544.class);
        startActivity(i);
    }
    public void clickLogin (View view){
        Intent i = new Intent( WelcomeSlideAssign_12544.this, WelcomeBack_12544.class);
        startActivity(i);
    }
}