package com.example.pc.ilactakipsistemi;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ProfilEdit extends AppCompatActivity {

    public TextView ProfiliDuzenle;
    public EditText EditIsim;
    public EditText EditSoyisim;
    public EditText EditKullaniciAdi;
    public EditText EditSifre;
    public EditText EditEmail;
    public EditText EditDogumTarihi;
    public Button btnEditKaydet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_edit);

        ProfiliDuzenle = (TextView)findViewById(R.id.txtProfiliDuzenle);
        EditIsim = (EditText) findViewById(R.id.txtEditIsim);
        EditSoyisim = (EditText) findViewById(R.id.txtEditSoyad);
        EditKullaniciAdi = (EditText) findViewById(R.id.txtEditKullaniciAdi);
        EditSifre = (EditText) findViewById(R.id.txtEditSifre);
        EditEmail = (EditText) findViewById(R.id.txtEditEmail);
        EditDogumTarihi = (EditText) findViewById(R.id.txtEditDogumTarihi);
        btnEditKaydet = (Button) findViewById(R.id.btnEditKaydet);


        EditIsim.setTypeface(Typeface.SANS_SERIF);
        EditSoyisim.setTypeface(Typeface.SANS_SERIF);
        EditKullaniciAdi.setTypeface(Typeface.SANS_SERIF);
        EditSifre.setTypeface(Typeface.SANS_SERIF);
        EditEmail.setTypeface(Typeface.SANS_SERIF);
        EditDogumTarihi.setTypeface(Typeface.SANS_SERIF);
        btnEditKaydet.setTypeface(Typeface.SANS_SERIF);
        ProfiliDuzenle.setTypeface(Typeface.SANS_SERIF);


        btnEditKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getApplicationContext(), "Güncellendi", Toast.LENGTH_SHORT);
                t.show();
                Intent i = new Intent(getApplicationContext(), Profil.class);
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
