package com.escobar.j0e009t.stephaniephrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playSound(View view){
        MediaPlayer soundFile = null;
        switch(view.getId()){
            case R.id.soyYo :
                soundFile = MediaPlayer.create(this, R.raw.soy_yo);
                break;
            case R.id.heyBabe :
                soundFile = MediaPlayer.create(this, R.raw.hey_babe);
                break;
            case R.id.fleek :
                soundFile = MediaPlayer.create(this, R.raw.fleek);
                break;
            case R.id.deficilSerYo :
                soundFile = MediaPlayer.create(this, R.raw.deficil_ser_yo);
                break;
            case R.id.cutABitch :
                soundFile = MediaPlayer.create(this, R.raw.cut_a_bitch);
                break;
            case R.id.ayGuey :
                soundFile = MediaPlayer.create(this, R.raw.ay_guey);
                break;
        }


        soundFile.start();
    }
}
