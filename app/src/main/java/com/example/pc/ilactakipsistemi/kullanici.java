package com.example.pc.ilactakipsistemi;

import android.icu.text.RelativeDateTimeFormatter;

/**
 * Created by fatma on 19.11.2017.
 */

public class kullanici {
    int kullaniciId;
    String kullaniciadi;
    String sifre;

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public void setKullaniciadi(String kullaniciadi) {
        this.kullaniciadi = kullaniciadi;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public int getKullaniciId() {
        return kullaniciId;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public String getSifre() {
        return sifre;
    }

    public kullanici(String kullaniciadi, String sifre){
        setKullaniciadi(kullaniciadi);
        setSifre(sifre);
    }
    public kullanici(){
    }
    }
