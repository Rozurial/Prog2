package com.example.flappybird;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class GameView extends View {
    private Paint paint = new Paint();
    private Bird flappy;

    public void setFlappy(Bird flappy) {
        this.flappy = flappy;
    }

    public GameView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        paint.setStrokeWidth(3);
        paint.setColor(Color.GRAY);
        super.onDraw(canvas);
        canvas.drawRect(flappy.getX(),
                flappy.getY(),
                flappy.getWidth() + flappy.getX(),
                flappy.getHeight() + flappy.getY(),
                paint);
    }


  //  Bitmap bird1 = BitmapFactory.decodeResource(getResources(), R.drawable.bird_01);
  //  Bitmap bird2 = BitmapFactory.decodeResource(getResources(), R.drawable.bird_02);
}