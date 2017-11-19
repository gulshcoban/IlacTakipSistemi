package com.example.pc.ilactakipsistemi;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Liste extends AppCompatActivity {

    public static Veritabani vt;
    public RecyclerView mRecyclerView;
    public RecyclerView.LayoutManager mLayoutManager;
    public FloatingActionButton btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);
        btnAdd = (FloatingActionButton)findViewById(R.id.btnAdd);
        mRecyclerView = (RecyclerView) findViewById(R.id.cycleView);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        vt = new Veritabani(this);
        vt.ac();
        ArrayList<String> ilaclar = vt.ilacgoruntule();

      /*  ArrayList<String> ilaclar = new ArrayList<String>();
        ilaclar.add("xyz");*/
        myAdapter myadapter = new myAdapter(ilaclar);
        mRecyclerView.setAdapter(myadapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vt.kapat();
                Intent i = new Intent(getApplicationContext(), com.example.pc.ilactakipsistemi.IlacEkle.class);
                startActivity(i); //List ekranına gidecek

            }
        });

    }

    protected void onResume(){
        vt.ac();
        super.onResume();
    }

    protected void onPause(){
        vt.kapat();
        super.onPause();
    }
}
