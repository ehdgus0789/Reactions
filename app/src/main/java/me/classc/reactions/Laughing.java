package me.classc.reactions;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;


public class Laughing extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laughing);



        final MediaPlayer buttonSound = MediaPlayer.create(Laughing.this, R.raw.laughing_giggling);

        Button Giggling = (Button) findViewById(R.id.giggling);

        Giggling.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound.start();
            }
        });




        final MediaPlayer buttonSound1 = MediaPlayer.create(Laughing.this, R.raw.laughing_wicked);

        Button Wicked = (Button) findViewById(R.id.lol);

        Wicked.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound1.start();
            }
        });



        final MediaPlayer buttonSound2 = MediaPlayer.create(Laughing.this, R.raw.laughing_awkward);

        Button awk = (Button) findViewById(R.id.awkward);

        awk.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound2.start();
            }
        });



        final MediaPlayer buttonSound3 = MediaPlayer.create(Laughing.this, R.raw.laughing_hystrical);

        Button hys= (Button) findViewById(R.id.wtf);

        hys.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound3.start();
            }
        });



        final MediaPlayer buttonSound4 = MediaPlayer.create(Laughing.this, R.raw.laughing_with_friends);

        Button friends = (Button) findViewById(R.id.what);

        friends.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound4.start();
            }
        });





        //Button close = (Button) findViewById(R.id.close); //next button

        //Intent i = getIntent();


        /*// Binding Click event to Button
        close.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg1) {
                //Closing SecondScreen Activity
                finish();
            }
        });*/

    }
}
