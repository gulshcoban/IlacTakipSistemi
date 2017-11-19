package com.example.pc.ilactakipsistemi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by fatma on 19.11.2017.
 */

public class Sqlite extends SQLiteOpenHelper{

    public Sqlite(Context c){

        super(c, "its", null, 1);
    }
    public void onCreate(SQLiteDatabase db)
    {
        String sql = "create table kullanici (id integer primary key autoincrement, kullaniciadi text, sifre text)";
        String sql1 = "create table ilac(ilacId integer primary key autoincrement, ilacadi text, gundekackere text, ilkkullanim integer)";
        db.execSQL(sql);
        db.execSQL(sql1);
    }

    public void onUpgrade(SQLiteDatabase db, int eski, int yeni){
        db.execSQL("drop table if exists kullanici");
        db.execSQL("drop table if exists ilac");
    }
}
