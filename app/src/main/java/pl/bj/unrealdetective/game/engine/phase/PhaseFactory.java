package pl.bj.unrealdetective.game.engine.phase;

import pl.bj.unrealdetective.game.engine.enums.GamePhase;
import pl.bj.unrealdetective.game.engine.phase.puzzle.scenario.PuzzleScenario;

public class PhaseFactory {

    public static Phase initialize(GamePhase newPhase, Integer scenario) {
        switch (newPhase) {
            case PUZZLE_GAME:
                return PuzzleScenario.initializeScenario(scenario);
        }

        return null;
    }
}
