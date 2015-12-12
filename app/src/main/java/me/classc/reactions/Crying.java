package me.classc.reactions;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Crying extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crying);




        final MediaPlayer buttonSound = MediaPlayer.create(Crying.this, R.raw.crying_baby);

        Button cryb = (Button) findViewById(R.id.crybaby);

        cryb.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound.start();
            }
        });

        final MediaPlayer buttonSound1 = MediaPlayer.create(Crying.this, R.raw.crying_sniffling);

        Button sniff = (Button) findViewById(R.id.lol);

        sniff.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound1.start();
            }
        });



        final MediaPlayer buttonSound2 = MediaPlayer.create(Crying.this, R.raw.crying_weeping);

        Button weep = (Button) findViewById(R.id.wtf);

        weep.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound2.start();
            }
        });




        final MediaPlayer buttonSound3 = MediaPlayer.create(Crying.this, R.raw.crying_sniffling);

        Button snif = (Button) findViewById(R.id.lol);

        snif.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound3.start();
            }
        });




        final MediaPlayer buttonSound4 = MediaPlayer.create(Crying.this, R.raw.crying_male_cry);

        Button male = (Button) findViewById(R.id.male);

        male.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound4.start();
            }
        });


















        // Button close = (Button) findViewById(R.id.close);

       // Intent i = getIntent();


        /*// Binding Click event to Button
        close.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg1) {
                //Closing SecondScreen Activity
                finish();
            }
        });*/

    }
}
