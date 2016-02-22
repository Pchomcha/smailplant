package com.example.com.smileplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class B11product extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b11product);

        Button fruit = (Button)findViewById(R.id.fruit);
        fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B11product.this, A12fruit.class);
                startActivity(intent);
            }
        });

        Button leaf = (Button)findViewById(R.id.leaf);
        leaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B11product.this, A12leave.class);
                startActivity(intent);
            }
        });

        Button flower = (Button)findViewById(R.id.flower);
        flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B11product.this, A12flower.class);
                startActivity(intent);
            }
        });

        Button root = (Button)findViewById(R.id.root);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B11product.this, A12root.class);
                startActivity(intent);
            }
        });

        ImageButton home = (ImageButton)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B11product.this, B10home.class);
                startActivity(intent);
            }
        });

    }
}
