package working_with_abstraction.exercise.cards;

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(String cardSuit, String cardRank) {
        this.suit = Suit.valueOf(cardSuit);
        this.rank = Rank.valueOf(cardRank);
    }

    public  int calculatePower() {
        return suit.getPower() + rank.getPower();

    }
}
