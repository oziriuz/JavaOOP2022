package working_with_abstraction.exercise.greedyTimes;

public class Gold extends Item {
    private long amount;

    public Gold(String name, long amount) {
        super(name, amount);
    }

    @Override
    public String getType() {
        return "GOLD";
    }
}
