package com.sbpinilla.recetapp.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.sbpinilla.recetapp.SqlConstants;

import static com.sbpinilla.recetapp.SqlConstants.SQL_CREATE_TABLE_RECETAS;
import static com.sbpinilla.recetapp.SqlConstants.SQL_DROP_TABLE_RECETAS;

public class DBHelper extends SQLiteOpenHelper {

    public static final int BD_VERSION = 1;


    public DBHelper(Context context) {
        super(context, SqlConstants.BD, null, BD_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(SQL_CREATE_TABLE_RECETAS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(SQL_DROP_TABLE_RECETAS);
        onCreate(db);

    }
}
