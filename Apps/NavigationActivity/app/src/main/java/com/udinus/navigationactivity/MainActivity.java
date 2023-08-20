package com.udinus.navigationactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container_main, new HomeActivity()).commit();

        bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Activity selectedActivity = null;

                switch (item.getItemId()) {
                    case R.id.menu_home:
                        selectedActivity = new HomeActivity();
                        break;
                    case R.id.menu_notifications:
                        selectedActivity = new NotificationsActivity();
                        break;
                    case R.id.menu_chats:
                        selectedActivity = new ChatsActivity();
                        break;
                    case R.id.menu_cart:
                        selectedActivity = new CartActivity();
                        break;
                    case R.id.menu_profile:
                        selectedActivity = new ProfileActivity();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.container_main, selectedActivity).commit();

                return true;
            }
        });
    }
}