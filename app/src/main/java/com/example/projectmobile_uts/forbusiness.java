package com.example.projectmobile_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class forbusiness extends AppCompatActivity {
    private ImageView bisnisklik;
    private ImageView corpklik;
    private ImageView kembalisolution;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forbusiness);

        bisnisklik = findViewById(R.id.bisnisklik);
        bisnisklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(forbusiness.this, forgovernment.class);
                startActivity(klik);
            }
        });

        corpklik = findViewById(R.id.corpklik);
        corpklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tombol = new Intent(forbusiness.this, forcorporate.class);
                startActivity(tombol);
            }
        });

        kembalisolution = findViewById(R.id.kembalisolution);
        kembalisolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(forbusiness.this, solution.class);
                startActivity(kembali);
            }
        });

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(forbusiness.this, foreveryone.class);
                startActivity(pindah);
            }
        });
    }
}