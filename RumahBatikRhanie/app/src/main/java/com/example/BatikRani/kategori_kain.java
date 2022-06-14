package com.example.BatikRani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class kategori_kain extends AppCompatActivity {
    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_kain);

        pindahHal2 = findViewById(R.id.kain1);
        pindahHal3 = findViewById(R.id.kain2);
        pindahHal4= findViewById(R.id.kain3);
        pindahHal5= findViewById(R.id.kain4);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_kain.this, kain1.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_kain.this, kain2.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_kain.this, kain3.class);
                startActivity(i);
            }
        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_kain.this, kain4.class);
                startActivity(i);
            }
        });
        
    }

    public void openActivity5(View view) {
        Intent intent = new Intent(this, kategori_kain.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
