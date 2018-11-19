package pl.bj.unrealdetective.game.engine.phase.scenario;

import pl.bj.unrealdetective.game.engine.phase.puzzle.PuzzlePhase;

import java.util.Map;

public class PuzzleScenario {

    private static final Map<Integer, PuzzleScenario> scenarios = initializeScenarioMap();

    public static PuzzlePhase initializeScenario(Integer scenario) {
        assert scenarios != null;
        return buildPhaseEngine(scenarios.get(scenario));
    }

    private static PuzzlePhase buildPhaseEngine(PuzzleScenario puzzleScenario) {
        // TODO: 19.11.2018 zaimplementowac tworzenie silnika dla zagadek  na podstawie scenariusza
        return null;
    }

    private static Map<Integer, PuzzleScenario> initializeScenarioMap() {
        // TODO: 19.11.2018 zaimplementowac budowe mapy scenariusze dla zagadek
        return null;
    }

}
