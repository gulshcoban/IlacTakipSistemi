package com.example.pc.ilactakipsistemi;


import java.util.Date;

public class Ilac {
    int ilacId;
    String ilacadi;
    int gundekackere;
    int ilkkulanım;

    public int getIlacId() {
        return ilacId;
    }

    public void setIlacId(int ilacId) {
        this.ilacId = ilacId;
    }

    public String getIlacadi() {
        return ilacadi;
    }

    public void setIlacadi(String ilacadi) {
        this.ilacadi = ilacadi;
    }

    public int getGundekackere() {
        return gundekackere;
    }

    public void setGundekackere(int gundekackere) {
        this.gundekackere = gundekackere;
    }

    public int getIlkkulanım() {
        return ilkkulanım;
    }

    public void setIlkkulanım(int ilkkulanım) {
        this.ilkkulanım = ilkkulanım;
    }

    public Ilac() {
    }

    public Ilac(int ilacId, String ilacadi, int gundekackere, int ilkkulanım) {
        setIlacId(ilacId);
        setIlacadi(ilacadi);
        setGundekackere(gundekackere);
        setIlkkulanım(ilkkulanım);
    }

    public Ilac(String ilacadi, int gundekackere, int ilkkulanım) {
        setIlacadi(ilacadi);
        setGundekackere(gundekackere);
        setIlkkulanım(ilkkulanım);
    }
}
