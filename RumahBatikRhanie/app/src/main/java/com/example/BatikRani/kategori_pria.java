package com.example.BatikRani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class kategori_pria extends AppCompatActivity {
    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_pria);

        pindahHal2 = findViewById(R.id.pria1);
        pindahHal3 = findViewById(R.id.pria2);
        pindahHal4= findViewById(R.id.pria3);
        pindahHal7= findViewById(R.id.pria4);

        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_pria.this, baju_pria1.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_pria.this, baju_pria3.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_pria.this, baju_pria4.class);
                startActivity(i);
            }
        });

        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_pria.this, baju_pria2.class);
                startActivity(i);
            }
        });
    }


    public void openActivity6(View view) {
        Intent intent = new Intent(this, kategori_pria.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
