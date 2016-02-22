package com.example.com.smileplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class B13season extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b13season);

        Button summer = (Button)findViewById(R.id.summer);
        summer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B13season.this, A14summer.class);
                startActivity(intent);
            }
        });

        Button winter = (Button)findViewById(R.id.winter);
        winter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B13season.this, A14winter.class);
                startActivity(intent);
            }
        });

        Button rainy = (Button)findViewById(R.id.rainy);
        rainy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B13season.this, A14rainy.class);
                startActivity(intent);
            }
        });

        Button alway = (Button)findViewById(R.id.alway);
        alway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B13season.this, A14alway.class);
                startActivity(intent);
            }
        });

        ImageButton home = (ImageButton)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B13season.this, B10home.class);
                startActivity(intent);
            }
        });
    }
}
