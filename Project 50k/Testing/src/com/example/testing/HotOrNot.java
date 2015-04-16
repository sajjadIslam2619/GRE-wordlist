package com.example.testing;

import java.io.File;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;

public class HotOrNot {

	public static final String KEY_ROWID = "_id";
	public static final String KEY_NAME = "name";
	public static final String KEY_PHNNO = "phn_no";
	
	
	private static final String DATABASE_TABLE = "TESTTABLE";
	
	private static final int DATABASE_VERSION = 1;
	public final Context myContext;
	private DbHelper ourHelper;
	private static final String DB_PATH = "/data/data/com.example.testing/databases/";
	private static final String DB_NAME = "TESTDB";
	private SQLiteDatabase ourDatabase;
	
	private static class DbHelper extends SQLiteOpenHelper{
		
		

		public DbHelper(Context context) {
			super(context, DB_NAME, null, DATABASE_VERSION);
	        
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
//			db.execSQL( "CREATE TABLE " + DATABASE_TABLE + " (" +
//					KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
//					KEY_NAME + " TEXT NOT NULL, " +
//					KEY_PHNNO + " TEXT NOT NULL);"
//					
//					
//					);
			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public HotOrNot(Context c){
		myContext = c;
	}
	public HotOrNot open(){
		ourHelper = new DbHelper(myContext);
		 //String myPath = DB_PATH + DB_NAME;
	    //ourDatabase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READONLY);
		ourDatabase = ourHelper.getWritableDatabase();
		return this;
	}
	public void close(){
		ourHelper.close();
	}
	public long createEntry(String name, String phn_no){
		
		ContentValues cv = new ContentValues();
		cv.put(KEY_NAME, name);
		cv.put(KEY_PHNNO, phn_no);
		return ourDatabase.insert(DATABASE_TABLE, null, cv);
	}
	public String getdata(){
		String[] col = new String[]{KEY_ROWID,KEY_NAME,KEY_PHNNO};
		String sql1 = "Select (*) from " + " TESTTABLE"; 
		Cursor c = ourDatabase.query(DATABASE_TABLE, col, null,null,null,null,null);
		//Cursor c =ourDatabase.rawQuery
		
		//Cursor g = ourDatabase.
		String res =" ";
		int iRow = c.getColumnIndex(KEY_ROWID);
		int iName = c.getColumnIndex(KEY_NAME);
		int iPhnNo = c.getColumnIndex(KEY_PHNNO);
		for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){
			res = res + c.getString(iRow) + " " + c.getString(iName) + " " +c.getString(iPhnNo);
		}
		return (res);
	}

}
