package pl.bj.unrealdetective.game.engine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import pl.bj.unrealdetective.game.engine.enums.GameState;
import pl.bj.unrealdetective.game.engine.phase.Phase;

public class UnrealDetectiveGame extends SurfaceView {

    //utils
    private Thread thread = null;
    private int nextFrameTime;

    //sounds
    private SoundPool soundPool;

    //playable area
    private final int NUM_BLOCKS_WIDE = 40;
    private int numBlocksHeight;

    //drawing
    private Canvas canvas;
    private SurfaceHolder surfaceHolder;
    private Paint paint;

    //models
    private Bob bob;
    //additional models

    //states etc.
    private GameState currentGameState;
    private Phase currentGamePhase;

    public UnrealDetectiveGame(Context context, Point size) {
        super(context);

        initializeSoundPool();
        initializeDrawing();
    }

    private void initializeDrawing() {
        surfaceHolder = getHolder();
        paint = new Paint();
    }

    private void initializeSoundPool() {
        AudioAttributes audioAttributes = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        soundPool = new SoundPool.Builder()
                .setMaxStreams(5)
                .setAudioAttributes(audioAttributes)
                .build();
    }

    public void newGame() {

    }

}
