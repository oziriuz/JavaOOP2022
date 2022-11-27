
package working_with_abstraction.exercise.greedyTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] inputTreasures = scanner.nextLine().split("\\s+");

        Bag myBag = new Bag(bagCapacity);

        for (int i = 0; i < inputTreasures.length; i += 2) {
            String treasure = inputTreasures[i];
            long amount = Long.parseLong(inputTreasures[i + 1]);

            Item item = null;

            if (treasure.length() == 3) {
                item = new Cash(treasure, amount);
            } else if (treasure.toLowerCase().endsWith("gem")) {
                item = new Gem(treasure, amount);
            } else if ("gold".equalsIgnoreCase(treasure)) {
                item = new Gold(treasure, amount);
            }

            if (item != null) {
                myBag.tryToPutInBag(item);
            }
        }

        myBag.printInventory();
    }
}