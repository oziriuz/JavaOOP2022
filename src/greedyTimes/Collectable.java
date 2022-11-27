package greedyTimes;

public interface Collectable {
    String getName();
    String getType();
    long getAmount();
    void add(long amount);
}
