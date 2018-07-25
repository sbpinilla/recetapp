package com.sbpinilla.recetapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.sbpinilla.recetapp.helpers.DBHelper;

import java.sql.SQLData;

public class SqlUtils {

    Context context;
    SQLiteDatabase sqLiteDatabase;
    SQLiteOpenHelper sqLiteOpenHelper;

    public SqlUtils(Context context) {
        this.context = context;
        sqLiteOpenHelper = new DBHelper(context);
        //sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();
        open();
    }

    public void open() {

        sqLiteDatabase = sqLiteOpenHelper.getWritableDatabase();

    }

    public void close() {

        sqLiteDatabase.close();
    }

}
