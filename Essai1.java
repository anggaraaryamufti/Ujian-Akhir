package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Essai1 extends AppCompatActivity {
    TextView teks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        teks = findViewById(R.id.teks);

        final Button tombol = findViewById(R.id.tombol);
        tombol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
               clickedbutton(v);
            }
        });

        setContentView(R.layout.activity_essai2);

    }void clickedbutton(View v){
        teks.setText("button has been clicked");
    }
}
