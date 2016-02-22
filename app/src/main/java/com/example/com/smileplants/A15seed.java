package com.example.com.smileplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class A15seed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a15seed);

        Button Okra = (Button)findViewById(R.id.Okra);
        Okra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A15seed.this, P1okra.class);
                startActivity(intent);
            }
        });

        Button garlic = (Button)findViewById(R.id.gralic);
        garlic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A15seed.this, P2garlic.class);
                startActivity(intent);
            }
        });
    }
}
