package com.example.administrator.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class OrderTABLE {

    private  MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSQLite, readSQLite;

    public static final String TABLE_ORDER = "orderTABLE";
    public static final String COLUMN_ID_ORDER = "_id";
    public static final String COLUMN_OFFICER = "Officer";
    public static final String COLUMN_DATE = "Date";
    public static final String COLUMN_FOOD = "Food";
    public static final String COLUMN_ITEM = "Item";

    public OrderTABLE(Context context){
    objMyOpenHelper = new MyOpenHelper(context);
    writeSQLite = objMyOpenHelper.getWritableDatabase();
    readSQLite = objMyOpenHelper.getReadableDatabase();
    }//Constructor
    public long addValueOrder(String strOfficer, String strDate, String strFood, int intItem){
        ContentValues objContenValues = new ContentValues();
        objContenValues.put(COLUMN_OFFICER,strOfficer);
        objContenValues.put(COLUMN_DATE, strDate);
        objContenValues.put(COLUMN_FOOD, strFood);
        objContenValues.put(COLUMN_ITEM, intItem);
        return writeSQLite.insert(TABLE_ORDER, null, objContenValues);

    }


}
