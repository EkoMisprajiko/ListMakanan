package com.android.listmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.codesgood.views.JustifiedTextView;

public class DetailMakanan extends AppCompatActivity {
    ImageView detailGambar;
    TextView detailNama;
    Spinner spinner;
    JustifiedTextView detailDeskripsi;

    int id, photo;
    String nama, detail;
    private String[] namaHewan = {"Ayam","Bebek","Sapi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        detailGambar    = findViewById(R.id.iv_makanan_detail);
        detailNama      = findViewById(R.id.tv_nama_detail);
        detailDeskripsi = findViewById(R.id.tv_deskripsi);
        spinner         = findViewById(R.id.spinner_detail);

        nama = getIntent().getStringExtra("nama");
        photo = getIntent().getIntExtra("photo",0);
        detail = getIntent().getStringExtra("detail");

        detailNama.setText(nama);
        detailDeskripsi.setText(detail);
        Glide.with(getApplicationContext()).load(photo).into(detailGambar);

        final ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.support_simple_spinner_dropdown_item, namaHewan);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(DetailMakanan.this, "ini adalah "+adapter.getItem(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}

