package com.example.com.smileplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class B14plant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b14plant);

        ImageButton seed = (ImageButton)findViewById(R.id.seed);
        seed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B14plant.this,A15seed.class);
                startActivity(intent);
            }
        });

        ImageButton cuttings = (ImageButton)findViewById(R.id.cuttings);
        cuttings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B14plant.this, A15cuttings.class);
                startActivity(intent);
            }
        });

        ImageButton budsplit = (ImageButton)findViewById(R.id.Budsplit);
        budsplit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B14plant.this, A15Budsplit.class);
                startActivity(intent);
            }
        });

        ImageButton home = (ImageButton)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B14plant.this, B10home.class);
                startActivity(intent);
            }
        });
    }
}
