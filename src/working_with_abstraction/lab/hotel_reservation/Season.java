package working_with_abstraction.lab.hotel_reservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private final int multiplicator;

    Season(int multiplicator) {
        this.multiplicator = multiplicator;
    }

    public int getMultiplicator() {
        return multiplicator;
    }
}
