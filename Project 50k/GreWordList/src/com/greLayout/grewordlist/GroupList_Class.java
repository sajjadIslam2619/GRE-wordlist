package com.greLayout.grewordlist;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GroupList_Class extends ListActivity{
	
	String GroupItemName_String[][] ={{"Group 1","Group 2","Group 3","Group 4","Group 5","Group 6","Group 7","Group 8","Group 9","Group 10","Group 11","Group 12","Group 13","Group 14","Group 15"},
			{"Group 1","Group 2 LOCKED","Group 3 LOCKED","Group 4 LOCKED","Group 5 LOCKED","Group 6 LOCKED","Group 7 LOCKED","Group 8 LOCKED","Group 9 LOCKED","Group 10 LOCKED","Group 11 LOCKED","Group 12 LOCKED","Group 13 LOCKED","Group 14 LOCKED","Group 15 LOCKED"}};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(GroupList_Class.this, android.R.layout.simple_list_item_1 ,GroupItemName_String[1]));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		Intent myIntent = new Intent(this, WordList_Class.class);
		myIntent.putExtra("ClickedGroupNo", position);
        startActivity(myIntent);
		
//		switch(position){
//		case 0:
//			
//			
//				
//			
//			break;
//		case 1:
//			Intent myIntent1 = new Intent(this, WordList_Class.class);
//			myIntent1.putExtra("ClickedGroupNo", position);
//	        startActivity(myIntent1);
//	
//			break;
//		case 2:
//			Intent myIntent2 = new Intent(this, WordList_Class.class);
//			myIntent2.putExtra("ClickedGroupNo", position);
//	        startActivity(myIntent2);
//	
//			break;
//		case 3:
//			
//			break;
//		case 4:
//		
//			break;
//		case 5:
//		
//			break;
//		case 6:
//		
//			break;
//		case 7:
//	
//			break;
//		case 8:
//		
//			break;
//		case 9:
//			 
//			break;
//		case 10:
//			 
//			break;
//		case 11:
//			 
//			break;
//		case 12:
//			 
//			break;
//		case 13:
//			 
//			break;
//		case 14:
//			 
//			break;
//			
//		}
		
		
		
		
	}

}
