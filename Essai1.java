package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Essai1 extends AppCompatActivity {
    TextView sebuahTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sebuahTeks = findViewById(R.id.teks);

        final Button tombolApaDeh = findViewById(R.id.tombol);
        tombolApaDeh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // terserah mau apa gitu
                tombolDipencet(v);
            }
        });

        setContentView(R.layout.activity_essai2);

    }void tombolDipencet(View v){
        sebuahTeks.setText("Tombol sudah dipencet");
    }
}