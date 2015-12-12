package me.classc.reactions;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button aboutUs = (Button) findViewById(R.id.button8);
        Button howitworks = (Button) findViewById(R.id.button9);
        ImageButton categories = (ImageButton) findViewById(R.id.categories);
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
                Intent nextScreen = new Intent(getApplicationContext(), Works.class);

                // starting new activity
                startActivity(nextScreen);

            }
        });
        categories.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg1) {
                //Starting a new Intent
                Intent nextScreen = new Intent(getApplicationContext(), Categories.class);

                // starting new activity
                startActivity(nextScreen);

            }
        });
    }



    //@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    /*public void onClickSound1(View v) {
        MediaPlayer mp = MediaPlayer.create(this, R.raw.sound1);
        //mp.start();
        if(mp.isPlaying()){
            mp.seekTo(0);
            mp.pause();
        }
        else{
            mp.seekTo(0);
            mp.start();
        }
    }    ;*/

}

