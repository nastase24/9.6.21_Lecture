package com.example.a9621lecture;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.widget.SeekBar;

public class CircleSurfaceView extends SurfaceView
        implements SeekBar.OnSeekBarChangeListener {

    //i want to create paint as a member variable for memory efficiency.
    public int circleSize;
    private Paint redPaint;
//to create a surfaceVIew
        //1. new class that extends surfaceview
    public CircleSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //2. enable drawing (setWillNotDraw(false))
        setWillNotDraw(false);
        //3.1 set up the paint color
        redPaint = new Paint();
        redPaint.setARGB(255,255,0,0);
        circleSize = 50;
    }
    @Override
    //3. tell it what to draw (onDraw)
    protected void onDraw(Canvas canvas ){
        //dont put paint here, bad idea for memory
        canvas.drawCircle(100,100,circleSize,redPaint);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        //WANT TO: update the sie of the circle
        //A: we need a member variable to hold the updated info
        circleSize = progress;
        //B: need to pass the message to the view that the current view isnt valid, to update it
        invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
//4 Must link the new class to the actual surface view element in the xml file