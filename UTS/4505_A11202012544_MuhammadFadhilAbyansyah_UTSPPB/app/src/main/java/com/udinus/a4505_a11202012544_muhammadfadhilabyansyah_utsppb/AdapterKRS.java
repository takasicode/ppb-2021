package com.udinus.a4505_a11202012544_muhammadfadhilabyansyah_utsppb;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterKRS extends RecyclerView.Adapter<AdapterKRS.KRSViewHolder> {
    @NonNull
    @Override
    public KRSViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.tampilan_sks, viewGroup, false);
        return new KRSViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KRSViewHolder namaViewHolder, int i) {
        String title = datakrs [i];
        namaViewHolder.txtTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return datakrs.length;
    }

    public class KRSViewHolder extends RecyclerView.ViewHolder{

        ImageView imgIcon;
        TextView txtTitle;

        public KRSViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
        }
    }

    private String[] datakrs;
    public AdapterKRS(String[] datakrs){ this.datakrs=datakrs; }
}
