package com.example.flappybird;

import android.graphics.Rect;
import java.util.Timer;
import java.util.TimerTask;

    public class GameController {
        private Bird flappy = new Bird(0, 0, 100, 100);
        private GameView gameView;

        public GameController(GameView gameView) {
            this.gameView = gameView;
            init();
        }

        private void init() {
            gameView.setFlappy(flappy);
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    flappy.fall();
                    gameView.postInvalidate();
                }
            }, 0, 5);
        }

        public void onTouch() {
            flappy.jump();
        }
    }
