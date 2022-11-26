package working_with_abstraction.exercise.cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Card Suits:");
//        for (Suit suitValue : Suit.values()) {
//            System.out.printf("Ordinal value: %d; Name value: %s%n", suitValue.ordinal(), suitValue.name());
//        }

//        System.out.println("Card Ranks:");
//        for (Rank rankValue : Rank.values()) {
//            System.out.printf("Ordinal value: %d; Name value: %s%n", rankValue.ordinal(), rankValue.name());
//        }

        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        Card card = new Card(cardSuit, cardRank);

        System.out.printf("Card name: %s of %s; Card power: %d", cardRank, cardSuit, card.calculatePower());
    }
}

