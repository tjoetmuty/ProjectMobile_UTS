package com.example.projectmobile_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class forcorporate extends AppCompatActivity {
    private ImageView kembalisolution;
    private ImageView imageView3;
    private ImageView bisnisklik;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forcorporate);

        kembalisolution = findViewById(R.id.kembalisolution);
        kembalisolution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(forcorporate.this, solution.class);
                startActivity(kembali);
            }
        });

        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bisnis = new Intent(forcorporate.this, forbusiness.class);
                startActivity(bisnis);
            }
        });

        bisnisklik = findViewById(R.id.bisnisklik);
        bisnisklik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent government = new Intent(forcorporate.this, forgovernment.class);
                startActivity(government);
            }
        });

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent again = new Intent(forcorporate.this, foreveryone.class);
                startActivity(again);
            }
        });
    }
}