package com.greLayout.grewordlist;

import android.app.Dialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler.Value;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class WordList_Class extends ListActivity{
	
	private int clickedGroupNo_int=9 ;
	


	String ListItemName_String[] ={"List 1","List 2","List 3","List 4","List 5","List 6","List 7","List 8","List 9","List 10"};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(WordList_Class.this, android.R.layout.simple_list_item_1 ,ListItemName_String));
		
	
		clickedGroupNo_int = getIntent().getExtras().getInt("ClickedGroupNo");
		
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		Intent myIntent = new Intent(this, Words_Class.class);
		myIntent.putExtra("ClickedListNo", position);
		myIntent.putExtra("ClickedGroupNo", clickedGroupNo_int);
        startActivity(myIntent);
		
//		Dialog d = new Dialog(this);
//		d.setTitle("");
//		TextView tv = new TextView(this);
//		String x = String.valueOf(clickedGroupNo_int);
//		tv.setText(x);
//	
//		d.setContentView(tv);
//		d.show();
		
//		switch(position){
//		case 0:
//			
//			break;
//		case 1:
//			break;
//		case 2:
//			break;
//		case 3:
//			break;
//		case 4:
//			break;
//		case 5:
//			break;
//		case 6:
//			break;
//		case 7:
//			break;
//		case 8:
//			break;
//		case 9:
//			break;
//
//			
//		}
		
		
		
		
	}

	
}
