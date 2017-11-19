package com.example.pc.ilactakipsistemi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Profil extends AppCompatActivity {

    public TextView PkullaniciAdi;
    public TextView Padi;
    public TextView Psoyadi;
    public TextView Pyas;
    public TextView Pdogumtarihi;
    public TextView Pilacsayisi;
    public ImageButton btnEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);


        PkullaniciAdi = (TextView)findViewById(R.id.txtPkullaniciAdi);
        Padi = (TextView)findViewById(R.id.txtPadi);
        Psoyadi = (TextView)findViewById(R.id.txtPsoyad);
        Pyas = (TextView)findViewById(R.id.txtPyas);
        Pdogumtarihi = (TextView)findViewById(R.id.txtPdogumtarihi);
        Padi = (TextView)findViewById(R.id.txtPadi);
        Pilacsayisi = (TextView)findViewById(R.id.txtPilacSayisi);
        btnEdit = (ImageButton) findViewById(R.id.imgEditBtn);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ProfilEdit.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_profil, menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();

        if(id == R.id.action_favorite){
            Intent i = new Intent(getApplicationContext(), Liste.class);
            startActivity(i);
        }
        else if(id == R.id.cikisYap){
            Intent i = new Intent(getApplicationContext(), GirisYap.class);
            startActivity(i);
        }

        return super.onOptionsItemSelected(item);
    }
}
