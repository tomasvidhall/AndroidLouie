package tomasvidhall.se.drinkinglouie.model;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by admin on 2014-09-26.
 */
public class Sprite {

    private Vector2D position;
    private Bitmap bmp;
    private int width;
    private int height;


    public Sprite(int id, Context c, float x, float y){
        position = new Vector2D(x,y);
        bmp = BitmapFactory.decodeResource(c.getResources(),id);
        width = bmp.getWidth();
        height = bmp.getHeight();

    }
    public Sprite(int id, Context c, Vector2D position){
        this(id,c, position.getX(),position.getY());
    }

    public void draw(Canvas canvas) {


        canvas.drawBitmap(bmp, position.getX() - this.getWidth() / 2, position.getY() + this.getHeight()/2, null);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setX(float x){
        this.position.setX(x);
    }

    public float getX() {
        return this.position.getX();
    }
}
