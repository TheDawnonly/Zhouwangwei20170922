package bawei.com.zhouwangwei20170922.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Mr.周 on 2017/9/22.
 */

public class MyHelp extends SQLiteOpenHelper {
    public MyHelp(Context context) {
        super(context, "week.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS person (_id integer primary key autoincrement,img text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
