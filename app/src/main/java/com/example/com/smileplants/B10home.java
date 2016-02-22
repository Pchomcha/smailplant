package com.example.com.smileplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class B10home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b10home);
        ImageButton product = (ImageButton)findViewById(R.id.product);
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B10home.this, B11product.class);
                startActivity(intent);
            }
        });

        ImageButton age = (ImageButton)findViewById(R.id.age);
        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B10home.this, B12age.class);
                startActivity(intent);
            }
        });

        ImageButton season = (ImageButton)findViewById(R.id.season);
        season.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B10home.this, B13season.class);
                startActivity(intent);
            }
        });

        ImageButton plant = (ImageButton)findViewById(R.id.plant);
        plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B10home.this, B14plant.class);
                startActivity(intent);
            }
        });
    }
}
