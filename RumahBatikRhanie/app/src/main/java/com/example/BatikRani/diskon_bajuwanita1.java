package com.example.BatikRani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class diskon_bajuwanita1 extends AppCompatActivity {

    LinearLayout pindahHal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diskon_bajuwanita1);

        pindahHal1 =findViewById(R.id.addtochart);

        pindahHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(diskon_bajuwanita1.this, transaksi.class);
                startActivity(i);
            }
        });
    }
}