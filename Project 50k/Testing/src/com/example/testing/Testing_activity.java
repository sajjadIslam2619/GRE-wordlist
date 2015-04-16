package com.example.testing;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Testing_activity extends Activity implements OnClickListener {
	
	EditText name_EditText;
	EditText phnNo_EditText;
	Button submit_Button;
	String name_String;
	String phnNo_String;
	String res;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_testing_activity);
		
		submit_Button = (Button)findViewById(R.id.submit_button_id);
		name_EditText= (EditText)findViewById(R.id.Name_EditText_id);
		phnNo_EditText= (EditText)findViewById(R.id.Phone_EditText_id);
		
		submit_Button.setOnClickListener(this);
		
		}



	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if( v.getId()==R.id.submit_button_id){
			
			Boolean didItWork = true;
			try{
			name_String = name_EditText.getText().toString();
			phnNo_String = phnNo_EditText.getText().toString();
			
			
			
			HotOrNot entry = new HotOrNot(Testing_activity.this);
			entry.open();
			entry.createEntry(name_String, phnNo_String);
			res = entry.getdata();
			Dialog d = new Dialog(this);
			d.setTitle(res);
			TextView tv = new TextView(Testing_activity.this);
			//tv.setText(phnNo_String);
			
			d.setContentView(tv);
			d.show();
			entry.close();
			
			}catch(Exception e){
				didItWork = false;
			}finally{
				if(didItWork){
					
					Dialog d = new Dialog(this);
					d.setTitle(res);
					TextView tv = new TextView(Testing_activity.this);
					tv.setText(phnNo_String);
					
					d.setContentView(tv);
					d.show();
				}
			}
			
			
		}
		
	}
}

