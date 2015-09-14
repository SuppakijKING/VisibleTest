package king.suppakij.visibletest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by KING on 14-Sep-15.
 */
public class serviceTABLE {

    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String SERVICE_TABLE = "serviceTABLE";
    public static final String COLUMN_ID_SERVICE = "_id";
    public static final String COLUMN_GUEST_NAME = "Guest_name";
    public static final String COLUMN_GUEST_TEL = "Guest_tel";
    public static final String COLUMN_GUEST_ADDRESS = "Guest_address";


    public serviceTABLE (Context context) {

        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    }

    public long addService(String strGuest_name, String strGuest_tele, String strGuest_address) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_GUEST_NAME, strGuest_name);
        objContentValues.put(COLUMN_GUEST_TEL, strGuest_tele);
        objContentValues.put(COLUMN_GUEST_ADDRESS, strGuest_address);
        return writeSqLiteDatabase.insert(SERVICE_TABLE, null, objContentValues);
    }
}
