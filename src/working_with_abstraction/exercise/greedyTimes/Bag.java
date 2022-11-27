package working_with_abstraction.exercise.greedyTimes;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Bag {
    private long capacity;
    private long goldSum;
    private long gemSum;
    private long cashSum;
    private final Map<String, Collectable> inventory;

    private boolean hasGold;
    private boolean hasGem;
    private boolean hasCash;


    public Bag(long capacity) {
        this.capacity = capacity;
        this.inventory = new TreeMap<>(Collections.reverseOrder());
    }

    public void tryToPutInBag(Collectable item) {
        if (capacity >= item.getAmount()) {
            if ("GOLD".equals(item.getType())) {
                goldSum += item.getAmount();
                put(item);
                hasGold = true;
            }

            if ("GEM".equals(item.getType())) {
                if (goldSum >= gemSum + item.getAmount()) {
                    gemSum += item.getAmount();
                    put(item);
                    hasGem = true;
                }
            }

            if ("CASH".equals(item.getType())) {
                if (gemSum >= cashSum + item.getAmount()) {
                    cashSum += item.getAmount();
                    put(item);
                    hasCash = true;
                }
            }
        }
    }

    private void put(Collectable item) {
        if (inventory.containsKey(item.getName())) {
            inventory.get(item.getName()).add(item.getAmount());
        } else {
            inventory.put(item.getName(), item);
        }

        reduceCapacity(item.getAmount());
    }

    private void reduceCapacity(long amount) {
        capacity -= amount;
    }

    public void printInventory(){
        if (hasGold) {
            printGold();
        }

        if (hasGem) {
            printGem();
        }

        if (hasCash) {
            printCash();
        }
    }

    private void printGold() {
        System.out.printf("<Gold> $%d%n", goldSum);
        System.out.printf("##Gold - %d%n", goldSum);
    }

    private void printGem() {
        System.out.printf("<Gem> $%d%n", gemSum);
        for (Collectable item : inventory.values()) {
            if ("GEM".equals(item.getType())) {
                System.out.printf("##%s - %d%n", item.getName(), item.getAmount());
            }
        }
    }

    private void printCash() {
        System.out.printf("<Cash> $%d%n", cashSum);
        for (Collectable item : inventory.values()) {
            if ("CASH".equals(item.getType())) {
                System.out.printf("##%s - %d%n", item.getName(), item.getAmount());
            }
        }
    }
}
