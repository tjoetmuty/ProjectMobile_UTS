package com.example.projectmobile_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pickoff extends AppCompatActivity {
    private ImageView imageViewpo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickoff);

        imageViewpo = findViewById(R.id.imageViewpo);
        imageViewpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(pickoff.this, service.class);
                startActivity(klik);
            }
        });
    }
}