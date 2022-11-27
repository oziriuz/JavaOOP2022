package working_with_abstraction.exercise.greedyTimes;

public class Cash extends Item {
    private long amount;

    public Cash(String name, long amount) {
        super(name, amount);
    }

    @Override
    public String getType() {
        return "CASH";
    }
}
