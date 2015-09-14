package king.suppakij.visibletest;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by KING on 14-Sep-15.
 */
public class ownerTABLE {

    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String OWNER_TABLE = "ownerTABLE";
    public static final String COLUMN_ID_OWNER = "_id";
    public static final String COLUMN_OWNER_ID = "Own_id";
    public static final String COLUMN_OWNER_PASSWORD = "Own_pass";
    public static final String COLUMN_OWNER_NAME = "Own_name";
    public static final String COLUMN_OWNER_LASTNAME = "Own_lastname";
    public static final String COLUMN_OWNER_IDNO = "Own_idno";
    public static final String COLUMN_OWNER_EMAIL = "Own_email";
    public static final String COLUMN_OWNER_ADDRESS = "Own_address";
    public static final String COLUMN_OWNER_TEL = "Own_tel";


    public ownerTABLE (Context context) {

        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    } // CON

    public long addOwner(String strOwn_id, String strOwn_pass, String strOwn_name, String strOwn_lastname, String strOwn_idno, String strOwn_email, String strOwn_address, String strOwn_tel) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(COLUMN_OWNER_ID, strOwn_id);
        objContentValues.put(COLUMN_OWNER_PASSWORD, strOwn_pass);
        objContentValues.put(COLUMN_OWNER_NAME, strOwn_name);
        objContentValues.put(COLUMN_OWNER_LASTNAME,strOwn_lastname);
        objContentValues.put(COLUMN_OWNER_IDNO, strOwn_idno);
        objContentValues.put(COLUMN_OWNER_EMAIL, strOwn_email);
        objContentValues.put(COLUMN_OWNER_ADDRESS, strOwn_address);
        objContentValues.put(COLUMN_OWNER_TEL, strOwn_tel);

        return writeSqLiteDatabase.insert(OWNER_TABLE, null, objContentValues);
    }
}//main
