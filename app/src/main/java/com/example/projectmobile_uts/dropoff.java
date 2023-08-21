package com.example.projectmobile_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dropoff extends AppCompatActivity {
    private ImageView imageViewpo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dropoff);

        imageViewpo = findViewById(R.id.imageViewpo);
        imageViewpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(dropoff.this, service.class);
                startActivity(back);
            }
        });
    }
}