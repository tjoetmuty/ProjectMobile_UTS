package com.example.projectmobile_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class forgovernment extends AppCompatActivity {
    private TextView village;
    private ImageView imageView3;
    private ImageView corpklik;
    private ImageView imageView;
    private ImageView kembalisolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgovernment);

        village = findViewById(R.id.village);
        village.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(forgovernment.this, governmentvillage.class);
                startActivity(klik);
            }
        });

        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bisnis = new Intent(forgovernment.this, forbusiness.class);
                startActivity(bisnis);
            }
        });

        corpklik = findViewById(R.id.corpklik);
        corpklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent corporate = new Intent(forgovernment.this, forcorporate.class);
                startActivity(corporate);
            }
        });

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(forgovernment.this, foreveryone.class);
                startActivity(kembali);
            }
        });

        kembalisolution = findViewById(R.id.kembalisolution);
        kembalisolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(forgovernment.this, solution.class);
                startActivity(kembali);
            }
        });

    }
}