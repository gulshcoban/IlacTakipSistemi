package com.example.pc.ilactakipsistemi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.constraint.solver.LinearSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Veritabani {
    SQLiteDatabase db;
    Sqlite bdb;

    public Veritabani(Context c){
        bdb = new Sqlite(c);
    }

    public void kullaniciOlustur(String kullaniciadi, String sifre){
        kullanici k = new kullanici(kullaniciadi, sifre);
        ContentValues val = new ContentValues();
        val.put("kullaniciadi", k.getKullaniciadi());
        val.put("sifre", k.getSifre());
        db.insert("kullanici", null, val);
    }

    public String goruntule()
    {
        String kolonlar[] = {"id", "kullaniciadi", "sifre"};
        Cursor c = db.query("kullanici", kolonlar,null, null, null, null,null);
        c.moveToFirst();
        String kullaniciadi ="";
        while (!c.isAfterLast()){
            kullaniciadi= c.getString(1);
            c.moveToNext();
        }
        c.close();
        return kullaniciadi;
    }

    public void ilacolustur(String ilacadi, int gundekackere, int ilkkullanim)
    {
        Ilac i = new Ilac(ilacadi, gundekackere, ilkkullanim);
        ContentValues val = new ContentValues();
        val.put("ilacadi", i.getIlacadi());
        val.put("gundekackere", i.getGundekackere());
        val.put("ilkkullanim", i.getIlkkulanım());
        db.insert("ilac", null, val);
    }

    public ArrayList<String> ilacgoruntule()
    {
        String kolonlar[] = {"ilacId", "ilacadi", "gundekackere", "ilkkullanim"};
        ArrayList<String> ilacAdi = new ArrayList<String>();
        Cursor c = db.query("ilac", kolonlar ,null, null, null, null,null);
        c.moveToFirst();
        while (!c.isAfterLast()){
            String ilacadi = c.getString(1);
            ilacAdi.add(ilacadi);
            c.moveToNext();
        }
        c.close();
        return ilacAdi;
    }


    public void ac(){
        db = bdb.getWritableDatabase();
    }
    public  void kapat()
    {
        bdb.close();
    }
}
