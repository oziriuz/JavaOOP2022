package working_with_abstraction.exercise.cards;

public enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int power;

    Suit(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
