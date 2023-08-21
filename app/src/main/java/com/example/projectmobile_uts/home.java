package com.example.projectmobile_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class home extends AppCompatActivity {

    private ImageView tombol1;
    private ImageView tombol2;
    private ImageView tombol3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tombol1 = findViewById(R.id.tombol1);
        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(home.this, aboutus.class);
                startActivity(next);
            }
        });

        tombol2 = findViewById(R.id.tombol2);
        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next2 = new Intent(home.this, service.class);
                startActivity(next2);
            }
        });

        tombol3 = findViewById(R.id.tombol3);
        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next3 = new Intent(home.this, solution.class);
                startActivity(next3);
            }
        });
    }
}