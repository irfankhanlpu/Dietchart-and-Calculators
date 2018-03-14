package com.irfan.dietchart;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 15-08-2017.
 */

    public class DbHandler extends SQLiteOpenHelper {

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "User_db.db";
    private static final String TB_NAME = "User_db";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String PASSWORD = "password";
    private static final String CONTACT = "contact";
    private static final String GENDER = "gender";

    ArrayList<User> userArrayList;

    public DbHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry = "create table " + TB_NAME + " ( " + ID + " integer primary key autoincrement, " + NAME + " text, " + CONTACT + " text, " + GENDER + " text )";
        db.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String qry = "drop table " + TB_NAME + " if exist ";
        db.execSQL(qry);
    }

    public long insertData(User u) {

        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(NAME, u.getName());
        values.put(PASSWORD, u.getPassword());
        values.put(CONTACT, u.getContact());
        values.put(GENDER, u.getGender());

        long id = db.insert(TB_NAME, null, values);
        db.close();
        return id;
    }

    public List<User> show() {
        ArrayList<User> contactlist = new ArrayList<User>();
        SQLiteDatabase db = getReadableDatabase();
        String[] columns = {ID, NAME, CONTACT, GENDER};
        Cursor c = db.query(TB_NAME, columns, null, null, null, null, null);
        while (c.moveToNext()) {
            int id1 = c.getInt(0);
            String name1 = c.getString(1);
            String num1 = c.getString(2);
            String email = c.getString(3);

            User u = new User();
            u.setId(id1);
            u.setName(name1);
            u.setContact(num1);
            u.setGender(email);

            contactlist.add(u);

        }
        return contactlist;
    }
}