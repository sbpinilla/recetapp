package com.sbpinilla.recetapp;

public class SqlConstants {

    // DB
    public static final String BD = "dbrecetas.db";

    // TABLE
    public static final String TABLE_RECETAS = "tblrecetas";

    // COLUMNS
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_NOMBRE = "nombre";
    public static final String COLUMN_PERSONAS = "personas";
    public static final String COLUMN_DESCRIPCION = "descripcion";
    public static final String COLUMN_PREPARACION = "preparacion";
    public static final String COLUMN_IMAGE = "image";
    public static final String COLUMN_FAV = "fav";

    //QUERY
    public static final String SQL_CREATE_TABLE_RECETAS =
            "CREATE TABLE " + TABLE_RECETAS + " ( " +
                    COLUMN_ID + " TEXT PRIMARY KEY , " +
                    COLUMN_NOMBRE + " TEXT , " +
                    COLUMN_PERSONAS + " INT , " +
                    COLUMN_DESCRIPCION + " TEXT , " +
                    COLUMN_PREPARACION + " TEXT , " +
                    COLUMN_IMAGE + " TEXT , " +
                    COLUMN_FAV + " INT  " +
                    ");";
    public static final String SQL_DROP_TABLE_RECETAS =
            "DROP TABLE "+TABLE_RECETAS+" ;";




}
