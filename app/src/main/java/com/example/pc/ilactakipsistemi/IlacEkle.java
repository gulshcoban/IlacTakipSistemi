package com.example.pc.ilactakipsistemi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IlacEkle extends AppCompatActivity {
    public static Veritabani vt;
    public static Ilac i;
    public EditText ilacadi;
    public EditText gundekackere;
    public EditText ilkkullanım;
    public Button hatirlat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilac_ekle);
        ilacadi = (EditText)findViewById(R.id.txtIlacAdi);
        gundekackere = (EditText)findViewById(R.id.txtGundeKacKere);
        ilkkullanım = (EditText)findViewById(R.id.txtIlkKullanmaSaati);
        hatirlat = (Button)findViewById(R.id.btnHatirlat);
        vt = new Veritabani(this);
        vt.ac();
        hatirlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //saat bilgisini hesapla alarmı kur
                i = new Ilac();
                i.setIlacadi(ilacadi.getText().toString());
                i.setGundekackere(Integer.parseInt(gundekackere.getText().toString()));
                i.setIlkkulanım(Integer.parseInt(ilkkullanım.getText().toString()));
                vt.ilacolustur(i.getIlacadi(), i.getGundekackere(), i.getIlkkulanım());
                vt.kapat();
                Intent intent = new Intent(getApplicationContext(), com.example.pc.ilactakipsistemi.Liste.class);
                startActivity(intent);
            }
        });
    }
}
