package me.classc.reactions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);

        Button close = (Button) findViewById(R.id.close);
        
        Intent i = getIntent();


        // Binding Click event to Button
        close.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				//Closing SecondScreen Activity
				finish();
			}
		});
        
    }
}
