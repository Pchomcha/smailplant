package com.example.com.smileplants;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class A00main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a00main);
        Button Start = (Button)findViewById(R.id.selec);
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A00main.this, B10home.class);
                startActivity(intent);
            }
        });

        Button Start1 = (Button)findViewById(R.id.pre);
        Start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A00main.this, A20pre.class);
                startActivity(intent);
            }
        });

        Button Start2 = (Button)findViewById(R.id.game);
        Start2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A00main.this, A30game.class);
                startActivity(intent);
            }
        });


        ImageButton Search = (ImageButton)findViewById(R.id.Search);
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A00main.this, C00Search.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder  = new AlertDialog.Builder( A00main.this );
        builder.setTitle("Smile Plant")
                .setIcon(getResources().getDrawable(R.drawable.ic_launcher))
                .setMessage("Are you sure you want to exit ? ")
                .setPositiveButton("Not now", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        A00main.this.finish();
                    }
                });

        AlertDialog alert  =  builder.create();
        alert.show();
    }

}