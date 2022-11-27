package working_with_abstraction.exercise.greedyTimes;

public class Gem extends Item {
    private long amount;

    public Gem(String name, long amount) {
        super(name, amount);
    }

    @Override
    public String getType() {
        return "GEM";
    }
}
