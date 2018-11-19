package pl.bj.unrealdetective.game.engine.phase.puzzle.model;

public class GameLaneProperties {

    public final Direction direction;
    public final int order;

    private GameLaneProperties(Direction direction, int order) {
        this.direction = direction;
        this.order = order;
    }

    public static GameLaneProperties of(Direction direction, int order) {
        return new GameLaneProperties(direction, order);
    }
}
