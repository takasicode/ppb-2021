package com.udinus.a4505_a11202012544_muhammadfadhilabyansyah_utsppb;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class SKSActivity extends AppCompatActivity {

    ActionBar actionBar;
    GridView gridView;

    String[] akademikNames = {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7" , "Semester 8"};
    int[] akademikImages = {R.drawable.ic_sks, R.drawable.ic_sks, R.drawable.ic_sks, R.drawable.ic_sks, R.drawable.ic_sks, R.drawable.ic_sks, R.drawable.ic_sks, R.drawable.ic_sks};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sks);

        gridView = findViewById(R.id.gridView);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), GridItemActivity.class);
                intent.putExtra("name", akademikNames[i]);
                intent.putExtra("image", akademikImages[i]);
                startActivity(intent);
            }
        });


        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return akademikImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data, null);
            TextView name = view1.findViewById(R.id.akademik);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(akademikNames[i]);
            image.setImageResource(akademikImages[i]);
            return view1;
        }
    }
}
