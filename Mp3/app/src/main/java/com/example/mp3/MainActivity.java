package com.example.mp3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button play,pause,stop;
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    public void init(){

        play = (Button)findViewById(R.id.btn_play);
        pause = (Button)findViewById(R.id.btn_Pause);
        stop = (Button)findViewById(R.id.btn_stop);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);

        song = MediaPlayer.create(MainActivity.this,R.raw.songgio);
        song.start();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_play:
                song.start();
                break;
            case R.id.btn_Pause:
                song.pause();
                break;
            case R.id.btn_stop:
                song.pause();
                song = MediaPlayer.create(MainActivity.this,R.raw.songgio);
                break;
        }

    }
}
