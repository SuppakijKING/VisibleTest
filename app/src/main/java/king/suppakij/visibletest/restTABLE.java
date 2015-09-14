package king.suppakij.visibletest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by KING on 14-Sep-15.
 */
public class restTABLE {

    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String RESTAURANT_TABLE = "restaurantTABLE";
    public static final String COLUMN_ID_RESTAURANT = "_id";
    public static final String COLUMN_RESTAURANT_NAME = "Rest_name";
    public static final String COLUMN_RESTAURANT_ACTIVATE = "Rest_Activate";
    public static final String COLUMN_RESTAURANT_PIC = "Rest_pic";
    public static final String COLUMN_RESTAURANT_EMAIL = "Rest_email";
    public static final String COLUMN_RESTAURANT_TEL = "Rest_tel";
    public static final String COLUMN_RESTAURANT_ADDRESS = "Rest_address";
    public static final String COLUMN_RESTAURANT_SIGNDATE = "Rest_Signdate";

    public restTABLE (Context context) {

        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    }//CON

    public long addRest (String strRest_name, String strRest_Activate, String strRest_pic, String strRest_email, String strRest_tel, String strRest_address, String strRest_Signdate) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_RESTAURANT_NAME, strRest_name);
        objContentValues.put(COLUMN_RESTAURANT_ACTIVATE, strRest_Activate);
        objContentValues.put(COLUMN_RESTAURANT_PIC, strRest_pic);
        objContentValues.put(COLUMN_RESTAURANT_EMAIL, strRest_email);
        objContentValues.put(COLUMN_RESTAURANT_TEL, strRest_tel);
        objContentValues.put(COLUMN_RESTAURANT_ADDRESS, strRest_address);
        objContentValues.put(COLUMN_RESTAURANT_SIGNDATE, strRest_Signdate);

        return writeSqLiteDatabase.insert(RESTAURANT_TABLE, null, objContentValues);
    }

}
