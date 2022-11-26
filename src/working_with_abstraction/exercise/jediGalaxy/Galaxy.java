package working_with_abstraction.exercise.jediGalaxy;

public class Galaxy {
    private final Field field;
    private final Jedi jedi;
    private final EvilPower evil;

    public Galaxy(Field field, Jedi jedi, EvilPower evil) {
        this.field = field;
        this.jedi = jedi;
        this.evil = evil;
    }

    public int moveJedi() {
        return jedi.move(field);
    }

    public void moveEvil() {
        this.evil.move(field);
    }
}
