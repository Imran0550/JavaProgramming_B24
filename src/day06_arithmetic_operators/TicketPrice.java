package day06_arithmetic_operators;

public class TicketPrice {
    public static void main(String[] args) {

        String city1 = "Chicago";
        String city2 = "Virginia";
        double baseTicketPrice = 110.50;
        double milesBetweenCities = 739.8;

        double totalPriceAfterMiles = baseTicketPrice + milesBetweenCities / 10;

        System.out.println("The ticket price from " + city1 + " to " + city2 + " is $" + totalPriceAfterMiles );
    }
}
