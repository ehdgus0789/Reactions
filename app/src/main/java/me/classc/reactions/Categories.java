package me.classc.reactions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Categories extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        Button crying = (Button) findViewById(R.id.crying);
        Button laughing= (Button) findViewById(R.id.laughing);
        Button phrases = (Button) findViewById(R.id.phrases);
        Button human = (Button) findViewById(R.id.human);

        Intent i = getIntent();


        /*// Binding Click event to Button
        close.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg1) {
                //Closing SecondScreen Activity
                finish();
            }
        });*/
        crying.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg1) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), Crying.class);

                // starting new activity
                startActivity(nextScreen);

            }
        });



        laughing.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), Laughing.class);

                // starting new activity
                startActivity(nextScreen);

            }
        });

        human.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg1) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), HumanNature.class);

                // starting new activity
                startActivity(nextScreen);

            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg1) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), Phrases.class);

                // starting new activity
                startActivity(nextScreen);

            }
        });
    }
}
