package database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class FolhaCPAOpenHelper extends SQLiteOpenHelper {


    public FolhaCPAOpenHelper(Context context) {
        super(context, "FolhaCPA", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL( ScriptDDL.getCreateTableGnrTipoAvaliacao() );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
