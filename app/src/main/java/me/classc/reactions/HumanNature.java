package me.classc.reactions;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class HumanNature extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.humannoise);

        final MediaPlayer buttonSound = MediaPlayer.create(HumanNature.this, R.raw.human_burp);

        Button burp = (Button) findViewById(R.id.burp);

        burp.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound.start();
            }
        });




        final MediaPlayer buttonSound1 = MediaPlayer.create(HumanNature.this, R.raw.human_coughing);

        Button cough = (Button) findViewById(R.id.lol);

        cough.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound1.start();
            }
        });



        final MediaPlayer buttonSound2 = MediaPlayer.create(HumanNature.this, R.raw.human_sneezing);

        Button sneeze = (Button) findViewById(R.id.wtf);

        sneeze.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound2.start();
            }
        });



        final MediaPlayer buttonSound3 = MediaPlayer.create(HumanNature.this, R.raw.human_snorting);

        Button snort= (Button) findViewById(R.id.snort);

        snort.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound3.start();
            }
        });



        final MediaPlayer buttonSound4 = MediaPlayer.create(HumanNature.this, R.raw.human_yawn);

        Button yawn = (Button) findViewById(R.id.what);

        yawn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                buttonSound4.start();
            }
        });

    }
}
