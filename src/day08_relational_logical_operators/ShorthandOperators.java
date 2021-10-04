package day08_relational_logical_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        double parkingFee = 7.50;

        System.out.println("You are an early birth so half off");

        // parkingFee = parkingFee / 2; -> manual way with reassigning

        parkingFee /= 2;

        System.out.println("your fee is; " + parkingFee);

        int tvs = 30;

      //  tvs--;
       // tvs--;

        tvs -=2; // tvs = 30 - 2;
        System.out.println(tvs);

        int i = 10;
        i %=2; // i = i % 2 --> i = 10 % 2 --> i =0
        System.out.println(i);

        int phones = 100;
        System.out.println(phones);

       // phones--;
       // phones --;
        phones -=2;// same thing as above;
        System.out.println(phones);

        // got a shipment
        phones +=150;
        System.out.println("after shipment: " + phones);

        // im gonna give these phones too 200  people 2 each, what is the remainder

        phones %=20;

        System.out.println(phones);

    }
}
