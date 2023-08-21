package com.example.projectmobile_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class service extends AppCompatActivity {
    private ImageView tombolpick;
    private ImageView back2;
    private ImageView tomboldrop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        tombolpick = findViewById(R.id.tombolpick);
        tombolpick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tombol = new Intent(service.this, pickoff.class);
                startActivity(tombol);
            }
        });

        back2 = findViewById(R.id.back2);
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent(service.this, home.class);
                startActivity(kembali);
            }
        });

        tomboldrop = findViewById(R.id.tomboldrop);
        tomboldrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent enter = new Intent(service.this, dropoff.class);
                startActivity(enter);
            }
        });

    }

}