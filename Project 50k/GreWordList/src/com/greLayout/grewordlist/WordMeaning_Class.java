package com.greLayout.grewordlist;





import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TabHost.TabSpec;

public class WordMeaning_Class extends Activity implements OnClickListener{

	TabHost wordMenu_TabHost;
	RatingBar level_RatingBar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.word_meaning_layout);
		
		 wordMenu_TabHost = (TabHost) findViewById(R.id.wordMenu_tabHost_id);
			
			
			wordMenu_TabHost.setup();
			TabSpec specs = wordMenu_TabHost.newTabSpec("tag1");
			specs.setContent(R.id.Definition);
			specs.setIndicator("Definition");
			wordMenu_TabHost.addTab(specs);
			 specs = wordMenu_TabHost.newTabSpec("tag2");
			specs.setContent(R.id.Synonyms);
			specs.setIndicator("Synonyms");
			wordMenu_TabHost.addTab(specs);
			specs = wordMenu_TabHost.newTabSpec("tag3");
			specs.setContent(R.id.Examples);
			specs.setIndicator("Examples");
			wordMenu_TabHost.addTab(specs);
			specs = wordMenu_TabHost.newTabSpec("tag4");
			specs.setContent(R.id.Notes);
			specs.setIndicator("Notes");
			wordMenu_TabHost.addTab(specs);
			
			
			addListenerOnRatingBar();
			
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.Definition:
			
			break;
		case R.id.Synonyms:
			break;
		case R.id.Examples:
			break;
		case R.id.Notes:
			break;
		
		}
		
	}
	
	

	private void addListenerOnRatingBar() {
		// TODO Auto-generated method stub
		
		level_RatingBar = (RatingBar) findViewById(R.id.level_ratingbar_id);
		
	 
		//if rating value is changed,
		//display the current rating value in the result (textview) automatically
		level_RatingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			public void onRatingChanged(RatingBar ratingBar, float rating,
				boolean fromUser) {
	 
				
	 
			}
		});
		
	}

}
