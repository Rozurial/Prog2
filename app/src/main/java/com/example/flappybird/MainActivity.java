package com.example.flappybird;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MotionEvent;


public class MainActivity extends AppCompatActivity {

    private GameController gameController;
    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        super.onCreate(savedInstanceState);
        gameView = new GameView(this);
        gameController = new GameController(gameView);
        setContentView(gameView);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gameController.onTouch();
        return super.onTouchEvent(event);
    }
}