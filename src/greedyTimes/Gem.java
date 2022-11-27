package greedyTimes;

public class Gem implements Collectable {
    private final String name;
    private long amount;

    public Gem(String name, long amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "GEM";
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
