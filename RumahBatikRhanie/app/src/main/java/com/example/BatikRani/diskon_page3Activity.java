package com.example.BatikRani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class diskon_page3Activity extends AppCompatActivity {

    LinearLayout pindahHal1;
    LinearLayout pindahHal2;
    LinearLayout pindahHal3;
    LinearLayout pindahHal4;
    LinearLayout pindahHal5;
    LinearLayout pindahHal6;
    LinearLayout pindahHal7;
    LinearLayout pindahHal8;
    LinearLayout pindahHal9;
    LinearLayout pindahHal10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diskon_page3);

        pindahHal1 = findViewById(R.id.dis1);
        pindahHal2 = findViewById(R.id.dis2);
        pindahHal3 = findViewById(R.id.dis3);
        pindahHal4= findViewById(R.id.dis4);
        pindahHal5= findViewById(R.id.dis5);
        pindahHal6= findViewById(R.id.dis6);
        pindahHal7= findViewById(R.id.dis7);
        pindahHal8= findViewById(R.id.dis8);
        pindahHal9= findViewById(R.id.dis9);
        pindahHal10= findViewById(R.id.dis10);




        pindahHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(diskon_page3Activity.this, diskon_kain1.class);
                startActivity(i);
            }
        });
        pindahHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(diskon_page3Activity.this, diskon_kain2.class);
                startActivity(i);
            }
        });
        pindahHal3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(diskon_page3Activity.this, diskon_bajuwanita2.class);
                startActivity(i);
            }
        });
        pindahHal4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(diskon_page3Activity.this, diskon_bajuwanita1.class);
                startActivity(i);
            }
        });
//        pindahHal5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(diskon_page3Activity.this, diskon_maryammustard.class);
//                startActivity(i);
//            }
//        });
//        pindahHal6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(diskon_page3Activity.this, diskon_talicerutymilo.class);
//                startActivity(i);
//            }
//        });
//
//        pindahHal7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(diskon_page3Activity.this, diskon_syarimaroon.class);
//                startActivity(i);
//            }
//        });
//        pindahHal8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(diskon_page3Activity.this, diskon_plisketdarkgrey.class);
//                startActivity(i);
//            }
//        });
//        pindahHal9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(diskon_page3Activity.this, diskon_lasercutrosewood.class);
//                startActivity(i);
//            }
//        });
//        pindahHal10.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(diskon_page3Activity.this, diskon_crinklemaroon.class);
//                startActivity(i);
//            }
//        });


    }
    public void openActivity3(View view) {
        Intent intent = new Intent(this, diskon_page3Activity.class);
        startActivity(intent);
    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
