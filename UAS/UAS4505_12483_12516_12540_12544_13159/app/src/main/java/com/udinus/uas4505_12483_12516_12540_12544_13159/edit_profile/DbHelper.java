package com.udinus.uas4505_12483_12516_12540_12544_13159.edit_profile;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="data_mhs.db";
    public static final String TABLE_NAME="table_mhs";
    public static final String COL_1="namad";
    public static final String COL_2="namab";
    public static final String COL_3="ttl";
    public static final String COL_4="pekerjaan";
    public static final String COL_5="alamat";
    public static final int DATABASE_VERTION=1;

    public DbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERTION);
        SQLiteDatabase db = this.getWritableDatabase();
    }
    @Override
    public void onCreate (SQLiteDatabase db){
        db.execSQL("create table table_mhs(nim text null, nama_mhs text null);");
    }
    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }

    //METODE TAMBAH DATA
    public boolean insertData(String namad, String namab, String ttl, String pekerjaan, String alamat){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, namad);
        contentValues.put(COL_2, namab);
        contentValues.put(COL_3, ttl);
        contentValues.put(COL_4, pekerjaan);
        contentValues.put(COL_5, alamat);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }

    //METODE MENGAMBIL DATA
    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from table_mhs", null);
        return res;
    }

    //METODE MERUBAH DATA
    public boolean updateData (String namad, String namab, String ttl, String pekerjaan, String alamat){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, namad);
        contentValues.put(COL_2, namab);
        contentValues.put(COL_3, ttl);
        contentValues.put(COL_4, pekerjaan);
        contentValues.put(COL_5, alamat);

        db.update(TABLE_NAME, contentValues, "nama depan = ?", new String[]{namad});
        return true;
    }

    //METODE MENGHAPUS DATA
    public  int deleteData (String nim) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "nim = ?", new String[]{nim});
    }
}
