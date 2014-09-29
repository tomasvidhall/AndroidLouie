package tomasvidhall.se.drinkinglouie.model;

/**
 * Created by admin on 2014-09-26.
 */
public class Vector2D {


    private float x,y;

    public Vector2D(){
        this.x= 0;
        this.y = 0;
    }

    public Vector2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }


}
