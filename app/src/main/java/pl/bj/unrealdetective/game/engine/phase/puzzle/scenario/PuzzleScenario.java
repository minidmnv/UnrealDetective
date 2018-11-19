package pl.bj.unrealdetective.game.engine.phase.puzzle.scenario;

import pl.bj.unrealdetective.game.engine.phase.puzzle.PuzzlePhase;
import pl.bj.unrealdetective.game.engine.phase.puzzle.model.PuzzleTarget;

import java.util.Map;

public class PuzzleScenario {

    private static final Map<Integer, PuzzleScenario> scenarios = initializeScenarioMap();

    private final Integer movesLimit;
    private final Map<PuzzleTarget, Integer> basicTargets;
    private final Map<PuzzleTarget, Integer> additionalTargets;

    private PuzzleScenario(Integer movesLimit, Map<PuzzleTarget, Integer> basicTargets, Map<PuzzleTarget, Integer> additionalTargets) {
        this.movesLimit = movesLimit;
        this.basicTargets = basicTargets;
        this.additionalTargets = additionalTargets;
    }


    public static PuzzlePhase initializeScenario(Integer scenario) {
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
