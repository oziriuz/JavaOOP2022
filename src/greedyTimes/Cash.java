package greedyTimes;

public class Cash implements Collectable {
    private final String name;
    private long amount;

    public Cash(String name, long amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "CASH";
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
