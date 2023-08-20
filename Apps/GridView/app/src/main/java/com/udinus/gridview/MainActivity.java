package com.udinus.gridview;

import static com.udinus.gridview.R.id.gridView;

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

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    String[] fruitNames = {"SKS","Input SKS","Mata Kuliah","Nilai Mata Kuliah","Keuangan","Kalender"};
    int[] fruitImages = {R.drawable.ic_sks,R.drawable.ic_input_sks,R.drawable.ic_mata_kuliah,R.drawable.ic_nilai_mata_kuliah,R.drawable.ic_keuangan,R.drawable.ic_kalender};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),GridItemActivity.class);
                intent.putExtra("name",fruitNames[i]);
                intent.putExtra("image",fruitImages[i]);
                startActivity(intent);
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return fruitImages.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(fruitNames[i]);
            image.setImageResource(fruitImages[i]);
            return view1;
        }
    }
}
