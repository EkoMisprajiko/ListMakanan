package com.android.listmakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.MakananViewHolder> {
    //pembantu untuk memakai aktifitas yang ada di Activity
    Context context;
    ArrayList<Makanan> dataMakanan;

    public AdapterMakanan(Context context, ArrayList<Makanan> dataMakanan) {
        this.context = context;
        this.dataMakanan = dataMakanan;
    }

    @NonNull
    @Override
    //untuk mengeset layout
    public MakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.grid_makanan,parent, false);
        return new MakananViewHolder(view);
    }

    @Override
    //untuk binding data
    public void onBindViewHolder(@NonNull final MakananViewHolder holder, final int position) {

        holder.textNama.setText(dataMakanan.get(position).getNama());
        Glide.with(context).load(dataMakanan.get(position).getPhoto()).into(holder.gambarMakanan);

        //mengirim data saat gambar di klik
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailMakanan.class);
                intent.putExtra("nama", dataMakanan.get(position).getNama());
                intent.putExtra("photo", dataMakanan.get(position).getPhoto());
                intent.putExtra("detail", dataMakanan.get(position).getDetail());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    //membatasi jumlah list pada halaman
    public int getItemCount() {
        return dataMakanan.size();
    }

    //class untuk inisialisasi id
    public class MakananViewHolder extends RecyclerView.ViewHolder {
        ImageView gambarMakanan;
        TextView textNama;


        public MakananViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarMakanan = itemView.findViewById(R.id.iv_makanan);
            textNama = itemView.findViewById(R.id.tv_nama_makanan);
        }
    }
}


/*

Melihat kebutuhan pada script yang merah Ctrl+P

Pembuatan cukup dengan Alt+Enter lalu ikuti instruksi dai AndroidStudio
kecuali script: extends RecyclerView.Adapter<AdapterMakanan.MakananViewHolder> yang harus ditulis secara manual.

<AdapterMakanan.MakananViewHolder> merupakan Objek atau class baru (MakananViewHolder) dalam class AdapterMakanan
Simpelnya: Class AdapterMakanan merupakan turunan dari RecyclerView.Adapter
Lalu Class MakananViewHolder adalah turunan dari RecyclerView.ViewHolder

dalam pembuatan adapter harus meng extends ke RecyclerView.Adapter atau ListView.Adapter dll
maksudnya adalah untuk membuat AdapterMakanan berfungsi sebagaimana RecyclerView.Adapter

pada script diatas MakananViewholder juga mengambil fungsi dari RecyclerView.ViewHolder

*/
