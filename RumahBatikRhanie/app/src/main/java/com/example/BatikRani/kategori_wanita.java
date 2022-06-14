package com.example.BatikRani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class kategori_wanita extends AppCompatActivity {

    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori_wanita);

        pindahHal2 = findViewById(R.id.bajuwanita1);
//        pindahHal3 = findViewById(R.id.bajuwanita2);
//        pindahHal4= findViewById(R.id.bajuwanita3);
        pindahHal5= findViewById(R.id.bajuwanita3);
        pindahHal6= findViewById(R.id.bajuwanita2);
        pindahHal7= findViewById(R.id.bajuwanita4);


        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_wanita.this, baju_wanita1.class);
                startActivity(i);
            }
        });
//        pindahHal3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(kategori_wanita.this, crinkle_maroon.class);
//                startActivity(i);
//            }
//        });
//        pindahHal4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(kategori_wanita.this, crinkle_mint.class);
//                startActivity(i);
//            }
//        });
        pindahHal5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_wanita.this, baju_wanita3.class);
                startActivity(i);
            }
        });
        pindahHal6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_wanita.this, baju_wanita2.class);
                startActivity(i);
            }
        });
        pindahHal7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(kategori_wanita.this, baju_wanita4.class);
                startActivity(i);
            }
        });




    }

    public void openActivity7(View view) {
        Intent intent = new Intent(this, kategori_wanita.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
