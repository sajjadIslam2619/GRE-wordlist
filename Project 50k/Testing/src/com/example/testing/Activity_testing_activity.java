package com.example.testing;



import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_testing_activity extends Activity implements OnClickListener {
	
	EditText name_EditText;
	EditText phnNo_EditText;
	Button submit_Button;
	String name_String;
	String phnNo_String;

	
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_testing_activity);
		
		submit_Button = (Button)findViewById(R.id.submit_button_id);
		
		submit_Button.setOnClickListener(this);
		
		}



	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if( v.getId()==R.id.submit_button_id){
			
			name_String = name_EditText.getText().toString();
			phnNo_String = phnNo_EditText.getText().toString();
			
			Dialog d = new Dialog(this);
			d.setTitle("");
			TextView tv = new TextView(this);
			tv.setText("sdfgsg");
			d.setContentView(tv);
			d.show();
			
		}
		
	}
}
