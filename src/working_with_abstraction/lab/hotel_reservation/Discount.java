package working_with_abstraction.lab.hotel_reservation;

public enum Discount {
    VIP(20),
    SECONDVISIT(10),
    NONE(0);

    private double percent;

    Discount(double percent) {
        this.percent = percent / 100.0;
    }

    public double getPercent() {
        return percent;
    }
}
