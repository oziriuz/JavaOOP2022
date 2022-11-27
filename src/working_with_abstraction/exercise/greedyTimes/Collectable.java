package working_with_abstraction.exercise.greedyTimes;

public interface Collectable {
    String getName();
    String getType();
    long getAmount();
    void add(long amount);
}
