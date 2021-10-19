package day50_inheritance;

public class Airport {

    public static void main(String[] args) {

        FlightTicket flightTicket = new FlightTicket("second", "New york","Florida");

      /*
      we cannot access directly
     flightTicket.type;

       */


        System.out.println(flightTicket.getType());
        System.out.println(flightTicket.getDepartureLocation());
        System.out.println(flightTicket.getArrivalLocation());
flightTicket.setType("first");
        System.out.println(flightTicket.getType());

    }
}
