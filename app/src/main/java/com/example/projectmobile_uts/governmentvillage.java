package com.example.projectmobile_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class governmentvillage extends AppCompatActivity {
    private TextView city;
    private ImageView imageView;
    private ImageView imageView3;
    private ImageView corpklik;
    private ImageView kembalisolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_governmentvillage);

        city = findViewById(R.id.city);
        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(governmentvillage.this, forgovernment.class);
                startActivity(klik);
            }
        });

        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bisnis = new Intent(governmentvillage.this, forbusiness.class);
                startActivity(bisnis);
            }
        });

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(governmentvillage.this, foreveryone.class);
                startActivity(kembali);
            }
        });

        corpklik = findViewById(R.id.corpklik);
        corpklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent corporate = new Intent(governmentvillage.this, forcorporate.class);
                startActivity(corporate);
            }
        });

        kembalisolution = findViewById(R.id.kembalisolution);
        kembalisolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(governmentvillage.this, solution.class);
                startActivity(kembali);
            }
        });

    }
}