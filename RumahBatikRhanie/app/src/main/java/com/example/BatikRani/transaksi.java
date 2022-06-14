package com.example.BatikRani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class transaksi extends AppCompatActivity {
TextView pindahHal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi);

        pindahHal1 =findViewById(R.id.txt_pyment);



        pindahHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(transaksi.this, pembayaran.class);
                startActivity(i);
            }
        });
    }
}