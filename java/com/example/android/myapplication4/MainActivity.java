package com.example.android.myapplication4;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.number_one);

        Button playButton = (Button) findViewById(R.id.play);

        playButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public  void onClick(View v){
                //   Toast.makeText(MainActivity.this , "play" , Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });
        Button pauseButton = (Button) findViewById(R.id.pause);

        pauseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                //  Toast.makeText(MainActivity.this , "pause" , Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

    }



}

