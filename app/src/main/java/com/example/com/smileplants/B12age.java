package com.example.com.smileplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class B12age extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b12age);

        Button shot = (Button)findViewById(R.id.shot);
        shot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B12age.this, A13shot.class);
                startActivity(intent);
            }
        });

        Button mid = (Button)findViewById(R.id.mid);
        mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B12age.this, A13mid.class);
                startActivity(intent);
            }
        });

        Button lon = (Button)findViewById(R.id.lon);
        lon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B12age.this, A13long.class);
                startActivity(intent);
            }
        });

        ImageButton home = (ImageButton)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B12age.this, B10home.class);
                startActivity(intent);
            }
        });
    }
}
