package com.example.BatikRani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class pembayaran extends AppCompatActivity {

    private final int RESULT_LOAD_IMG = 1;
    LinearLayout pindahHal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_pembayaran);

        pindahHal1 =findViewById(R.id.pay_ll);

        pindahHal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(pembayaran.this, konfirmasi.class);
                startActivity(i);
            }
        });

    }
    public void loadimagefromGallery(View view){
        //buat fungsi intent
        Intent galleryIntent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        //mulai aktiviti
        startActivityForResult(galleryIntent, RESULT_LOAD_IMG);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // saat gambar iambil
        if (requestCode == RESULT_LOAD_IMG && resultCode == RESULT_OK && null !=data){
            try {
                //dapatkan gambar dari data intent
                Uri selectedImage = data.getData();
                ImageView imgView = (ImageView) findViewById(R.id.foto);
                // mengatur gambar pada ImageView
                imgView.setImageURI(selectedImage);
            } catch (Exception e) {
                Toast.makeText(this,"Kesalahan terjadi", Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this,"Anda belum mengambil gambar",Toast.LENGTH_LONG).show();
        }
    }
}





