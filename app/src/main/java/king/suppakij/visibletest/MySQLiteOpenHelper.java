package king.suppakij.visibletest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by KING on 13-Sep-15.
 */
public class MySQLiteOpenHelper extends SQLiteOpenHelper {


    //Explicit

    private static final String DATABASE_NAME = "Restaurant.db";
    private static final int DATABASE_VERSION = 1;
    private static final String CREATE_ADMIN_TABLE = "create table userTABLE (_id integer primary key, User text, Password text, Name text);";
    private static final String CREATE_OWNER_TABLE = "create table userTABLE (_id integer primary key, Own_id text, Own_pass text, Own_name text, Own_lastname text, Own_idno integer, Own_email text, Own_address text, Own_tel integer );";
    private static final String CREATE_RESTAURANT_TABLE = "create table foodTABLE (_id integer primary key, Rest_name text,Rest_Activate text, Rest_pic text, Rest_email text, Rest_tel text,Rest_address text, Rest_Signdate text);";
    private static final String CREATE_FOOD_TABLE = "create table foodTABLE (_id integer primary key, Food text, Source text, Price text);";
    private static final String CREATE_SERVICE_TABLE = "create table foodTABLE (_id integer primary key, Guest_name text, Guest_tel integer, Guest_address text);";


    public MySQLiteOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }//Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_ADMIN_TABLE);
        db.execSQL(CREATE_OWNER_TABLE);
        db.execSQL(CREATE_RESTAURANT_TABLE);
        db.execSQL(CREATE_FOOD_TABLE);
        db.execSQL(CREATE_SERVICE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
} // Main class
