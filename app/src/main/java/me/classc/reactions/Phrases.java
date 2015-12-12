package me.classc.reactions;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Phrases extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phrases);

        final MediaPlayer buttonSound = MediaPlayer.create(Phrases.this, R.raw.phrases_aww);

        Button aww = (Button) findViewById(R.id.aww);

        aww.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound.start();
            }
        });




        final MediaPlayer buttonSound1 = MediaPlayer.create(Phrases.this, R.raw.phrases_lol);

        Button lol = (Button) findViewById(R.id.lol);

        lol.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound1.start();
            }
        });



        final MediaPlayer buttonSound2 = MediaPlayer.create(Phrases.this, R.raw.phrases_omg);

        Button omg = (Button) findViewById(R.id.omg);

        omg.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound2.start();
            }
        });



        final MediaPlayer buttonSound3 = MediaPlayer.create(Phrases.this, R.raw.phrases_what_are_those);

        Button wrt= (Button) findViewById(R.id.what);

        wrt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound3.start();
            }
        });



        final MediaPlayer buttonSound4 = MediaPlayer.create(Phrases.this, R.raw.phrases_wtf);

        Button wtf = (Button) findViewById(R.id.wtf);

        wtf.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound4.start();
            }
        });

    }
}
