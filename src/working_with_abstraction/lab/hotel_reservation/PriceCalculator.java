package working_with_abstraction.lab.hotel_reservation;

public class PriceCalculator {
    public static double calculateHolidayPrice(double pricePerDay, int numbersOfDays,
                                               Season season, Discount discount) {
        double price = pricePerDay * numbersOfDays;
        price *= season.getMultiplicator();
        price = price - (price * discount.getPercent());

        return price;
    }
}
