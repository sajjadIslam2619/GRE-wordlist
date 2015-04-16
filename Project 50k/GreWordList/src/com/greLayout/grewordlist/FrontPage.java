package com.greLayout.grewordlist;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class FrontPage extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frontpage);
		
		
		 Thread timer = new Thread (){
				public void run(){
					try{
						sleep(1000);
					}catch(InterruptedException e ){
						e.printStackTrace();
					}finally{
						Intent openMenu = new Intent("com.greLayout.grewordlist.MENU");
						startActivity(openMenu);
						
						
					}
					
					
				}
			};
			timer.start();
	}



}
