package pl.bj.unrealdetective.game;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import pl.bj.unrealdetective.game.engine.UnrealDetectiveGame;

public class GameActivity extends Activity {

    private UnrealDetectiveGame gameEngine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Display display = getWindowManager().getDefaultDisplay();

        Point size = new Point();
        display.getSize(size);

        gameEngine = new UnrealDetectiveGame(this, size);

        setContentView(gameEngine);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
