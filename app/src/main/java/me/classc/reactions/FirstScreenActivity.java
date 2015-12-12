package me.classc.reactions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Button;

public class FirstScreenActivity extends Activity {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		Button aboutUs = (Button) findViewById(R.id.button8);
		Button howitworks = (Button) findViewById(R.id.button9);
		//Listening to button event
		aboutUs.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				//Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), About.class);

				startActivity(nextScreen);
			}
		});

		howitworks.setOnClickListener(new View.OnClickListener() {

			public void onClick(View arg0) {
				//Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), About.class);

				// starting new activity
				startActivity(nextScreen);

			}
		});
	}
};
