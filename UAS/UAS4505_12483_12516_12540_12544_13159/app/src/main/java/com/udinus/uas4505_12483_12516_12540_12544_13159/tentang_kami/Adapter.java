package com.udinus.uas4505_12483_12516_12540_12544_13159.tentang_kami;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.udinus.uas4505_12483_12516_12540_12544_13159.R;

public class Adapter extends RecyclerView.Adapter<Adapter.NamaViewHolder> {
    @NonNull
    @Override
    public NamaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.tampilan_kelompok, viewGroup, false);
        return new NamaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NamaViewHolder namaViewHolder, int i) {
        String title = datanama [i];
        namaViewHolder.txtNama.setText(title);
    }

    @Override
    public int getItemCount() {
        return datanama.length;
    }

    public class NamaViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtNama;

        public NamaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            txtNama = (TextView) itemView.findViewById(R.id.txtNama);
        }
    }

    private String[] datanama;
    public Adapter(String[] datanama){
        this.datanama=datanama;
    }

}
