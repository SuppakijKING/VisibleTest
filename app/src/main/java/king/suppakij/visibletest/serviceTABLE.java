package king.suppakij.visibletest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by KING on 14-Sep-15.
 */
public class serviceTABLE {

    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;


    public serviceTABLE (Context context) {

        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    }
}
