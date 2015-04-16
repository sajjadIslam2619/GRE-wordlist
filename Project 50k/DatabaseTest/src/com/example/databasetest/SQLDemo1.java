package com.example.databasetest;

import android.app.Activity;
import android.database.sqlite.*;
import android.os.Bundle;
import android.widget.Toast;

public class SQLDemo1 extends Activity {
	SQLiteDatabase db;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// filePathis a complete destination of the form
		// "/data/data/<namespace>/<databaseName>"
		// "/sdcard/<databasename>"
		// "mnt/sdcard/<databasename>"
		try {
			db = SQLiteDatabase.openDatabase(
					"Android/data/myfriendsDB", null,
					SQLiteDatabase.CREATE_IF_NECESSARY);
			db.close();
		} catch (SQLiteException e) {
			Toast.makeText(this, e.getMessage(), 1).show();
		}
	}// onCreate
}