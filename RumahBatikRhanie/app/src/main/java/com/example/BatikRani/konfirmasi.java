package com.example.BatikRani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class konfirmasi extends AppCompatActivity {
    TextView pindahHal1;
    TextView pindahHal2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi);

        pindahHal1 =findViewById(R.id.place_order);
        pindahHal2 =findViewById(R.id.back);



        pindahHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(konfirmasi.this,menaksir_page5Activity.class);
                startActivity(i);
            }
        });
        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(konfirmasi.this,pembayaran.class);
                startActivity(i);
            }
        });





    }
}