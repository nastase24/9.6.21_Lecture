package com.example.a9621lecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For events
        //1. find obj or elements to interact
        SeekBar circleSeekBar = (SeekBar) findViewById(R.id.circleSeekBar);
        CircleSurfaceView circleSurfaceView =
                (CircleSurfaceView) findViewById(R.id.circleSurfaceView);

        //2 set the listener for the even to be handled
        circleSeekBar.setOnSeekBarChangeListener(circleSurfaceView);

        //3 not in this file, but implement the listener
    }

}