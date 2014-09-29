package tomasvidhall.se.drinkinglouie;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import tomasvidhall.se.drinkinglouie.model.Sprite;
import tomasvidhall.se.drinkinglouie.view.GameCanvasView;

/**
 * Created by admin on 2014-09-29.
 */
public class LouieGame{


    private boolean running;
    private long currentFrameTime, lastFrameTime;
    private Sprite sprite;
    private Paint paint;

    public LouieGame(Context context){
        this.running = true;
        sprite = new Sprite(R.drawable.chicken4,context, 100,100);
        paint = new Paint();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(running){
                    currentFrameTime = System.currentTimeMillis();

                    float delta = (float) ((currentFrameTime - lastFrameTime))/1000;

                    update(delta);
                    lastFrameTime = System.currentTimeMillis();

                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();

    }



    private void update(float delta) {
        sprite.setX(sprite.getX()+1);
    }

    public void draw(Canvas canvas) {
        canvas.drawLine(0,0,canvas.getWidth(),0,paint);
        canvas.drawLine(0,0,0,canvas.getHeight(),paint);
        canvas.drawLine(canvas.getWidth(),0,canvas.getWidth(),canvas.getHeight(),paint);
        canvas.drawLine(0,canvas.getHeight(),canvas.getWidth(),canvas.getHeight(),paint);
        paint.setColor(Color.WHITE);
        canvas.drawRect(canvas.getClipBounds(),paint);
        sprite.draw(canvas);
    }
}
