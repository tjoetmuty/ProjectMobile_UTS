package com.example.projectmobile_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class foreveryone extends AppCompatActivity {
    private ImageView kembalisolution;
    private ImageView imageView3;
    private ImageView bisnisklik;
    private ImageView corpklik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foreveryone);

        kembalisolution = findViewById(R.id.kembalisolution);
        kembalisolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(foreveryone.this, solution.class);
                startActivity(kembali);
            }
        });

        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(foreveryone.this, forbusiness.class);
                startActivity(pindah);
            }
        });

        bisnisklik = findViewById(R.id.bisnisklik);
        bisnisklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bisnis = new Intent(foreveryone.this, forgovernment.class);
                startActivity(bisnis);
            }
        });

        corpklik = findViewById(R.id.corpklik);
        corpklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah2 = new Intent(foreveryone.this, forcorporate.class);
                startActivity(pindah2);
            }
        });
    }
}