package com.example.com.smileplants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class A20pre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a20pre);

        Button B = (Button)findViewById(R.id.button);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A20pre.this, A21digest.class);
                startActivity(intent);
            }
        });

        Button B1 = (Button)findViewById(R.id.button2);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A20pre.this, A21digest.class);
                startActivity(intent);
            }
        });

        Button B2 = (Button)findViewById(R.id.button3);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A20pre.this, A21digest.class);
                startActivity(intent);
            }
        });

        Button B3 = (Button)findViewById(R.id.button4);
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A20pre.this, A21digest.class);
                startActivity(intent);
            }
        });

        Button B4 = (Button)findViewById(R.id.button5);
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A20pre.this, A21digest.class);
                startActivity(intent);
            }
        });

        Button B5 = (Button)findViewById(R.id.button6);
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A20pre.this, A21digest.class);
                startActivity(intent);
            }
        });
    }
}
