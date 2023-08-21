package com.example.projectmobile_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class solution extends AppCompatActivity {
    private ImageView imagenext;
    private ImageView imageView6;
    private ImageView imagenextg;
    private ImageView back2;
    private ImageView tombolpick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);

        imagenext = findViewById(R.id.imagenext);
        imagenext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanjut = new Intent(solution.this, forbusiness.class);
                startActivity(lanjut);
            }
        });

        imageView6 = findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanjut2 = new Intent(solution.this, forcorporate.class);
                startActivity(lanjut2);
            }
        });

        imagenextg = findViewById(R.id.imagenextg);
        imagenextg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanjut3 = new Intent(solution.this, forgovernment.class);
                startActivity(lanjut3);
            }
        });

        back2 = findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(solution.this, home.class);
                startActivity(kembali);
            }
        });

        tombolpick = findViewById(R.id.tombolpick);
        tombolpick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(solution.this, foreveryone.class);
                startActivity(next);
            }
        });
    }
}