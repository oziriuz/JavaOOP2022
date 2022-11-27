package greedyTimes;

public class Gold implements Collectable {
    private final String name;
    private long amount;

    public Gold(String name, long amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "GOLD";
    }

    @Override
    public long getAmount() {
        return amount;
    }

    @Override
    public void add(long amountToAdd) {
        this.amount += amountToAdd;
    }
}
