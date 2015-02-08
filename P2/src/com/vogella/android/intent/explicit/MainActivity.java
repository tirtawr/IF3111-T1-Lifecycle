package com.vogella.android.intent.explicit;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onClick(View view) {
	    EditText text = (EditText) findViewById(R.id.inputforintent);
	    // used later
	    String value = text.getText().toString();
	    // TODO 1 create new Intent(context, class)
	    // use the activity as context parameter
	    // and "ResultActivity.class" for the class parameter
	    
	    Intent intent1 = new Intent(this, ResultActivity.class);
	    
	    // TODO 2 start second activity with
	    // startActivity(intent);
	    startActivity(intent1);
	  }

}
