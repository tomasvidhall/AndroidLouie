package tomasvidhall.se.drinkinglouie.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import tomasvidhall.se.drinkinglouie.LouieGame;
import tomasvidhall.se.drinkinglouie.R;
import tomasvidhall.se.drinkinglouie.model.Sprite;

/**
 * TODO: document your custom view class.
 */
public class GameCanvasView extends View {
    LouieGame game;

    public GameCanvasView(Context context) {
        super(context);
        init(null, 0);
    }

    public GameCanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public GameCanvasView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {

        //Start the gameLoop
        game = new LouieGame(getContext());

        // Load attributes

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        game.draw(canvas);

    }


}
