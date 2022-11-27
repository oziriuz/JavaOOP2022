package working_with_abstraction.exercise.greedyTimes;

public abstract class Item implements Collectable {
    private String name;
    private long amount;

    public Item(String name, long amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public long getAmount() {
        return this.amount;
    }

    @Override
    public void add(long amount) {
        this.amount += amount;
    }
}
