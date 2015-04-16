package com.greLayout.grewordlist;



import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{
	
	String menuItemName_String[] ={ "Word List","A - Z","Search Word", "Quize", "Level", "instruction"  };
	
	String menuItemClassName_String[]= {"GroupList_Class","AtoZ_Class","SearchWord_Class","Quiz_Class","Level_Class","Instruction_Class"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1 ,menuItemName_String));
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String cheese = menuItemClassName_String[position];
		
		
		
		try{
			
		Class ourClass = Class.forName("com.greLayout.grewordlist." +cheese);
		Intent ourIntent = new Intent(Menu.this, ourClass);
		startActivity(ourIntent); 
		
		}catch(ClassNotFoundException e){
			
			e.printStackTrace();
		}
		
		
	}

}
