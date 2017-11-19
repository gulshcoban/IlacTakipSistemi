package com.example.pc.ilactakipsistemi;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class GirisYap extends AppCompatActivity {

    public static Veritabani vt;

    public EditText KullaniciAdi;
    public EditText Sifre;
    public Button Girisyap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_yap);
        vt = new Veritabani(this);
        vt.ac();
        KullaniciAdi  = (EditText)findViewById(R.id.txtKullaniciAdi);
        Sifre = (EditText)findViewById(R.id.txtSifre);
        Girisyap = (Button)findViewById(R.id.btnGirisYap);


        KullaniciAdi.setTypeface(Typeface.SANS_SERIF);
        Sifre.setTypeface(Typeface.SANS_SERIF);
        Girisyap.setTypeface(Typeface.SANS_SERIF);

        Girisyap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kullanici k = new kullanici();
                k.setKullaniciadi(KullaniciAdi.getText().toString());
                k.setSifre(Sifre.getText().toString());
                vt.kullaniciOlustur(k.getKullaniciadi(), k.getSifre());
                Toast.makeText(getApplicationContext(), "Hoşgeldiniz", Toast.LENGTH_SHORT).show();
                vt.kapat();
                Intent i = new Intent(getApplicationContext(), com.example.pc.ilactakipsistemi.Liste.class);
                startActivity(i); //List ekranına gidecek
            }
        });
    }
}
