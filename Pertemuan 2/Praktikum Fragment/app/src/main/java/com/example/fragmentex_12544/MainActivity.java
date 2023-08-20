package com.example.fragmentex_12544;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button firstFragment, secondFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstFragment = (Button) findViewById(R.id.FirstFragment);
        secondFragment = (Button) findViewById(R.id.SecondFragment);

        firstFragment.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                loadFragment(new com.example.fragmentex_12544.firstFragment());
            }
        });

        secondFragment.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                loadFragment(new com.example.fragmentex_12544.secondFragment());
            }
        });
    }
    private void loadFragment (Fragment fragment){
        FragmentManager fm =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}