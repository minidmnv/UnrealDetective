package pl.bj.unrealdetective;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import pl.bj.unrealdetective.game.GameActivity;

public class MainActivity extends Activity {

    Button startGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        initializeButtons();
    }

    private void initializeButtons() {
        startGameButton = findViewById(R.id.startGameButton);
        startGameButton.setOnClickListener(v -> startActivity(new Intent(this, GameActivity.class)));
    }
}
