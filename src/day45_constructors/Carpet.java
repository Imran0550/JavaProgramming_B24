package day45_constructors;

public class Carpet {

    /*
    info:

       width, length, unit price, if its persian

     constructor:
           initialize the variables

           calculate the price:
              w * l * unit price

              if its persian add 200$

    toString to print the total price

     */

    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean ifItsPersian;

    public Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean isPersian) {

        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        ifItsPersian = isPersian;

        totalPrice = width * length * unitPrice;


        if (ifItsPersian) {
            totalPrice += 200;
        }


    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width = " + width +
                ", length = " + length +
                ", unitPrice = " + unitPrice +
                ", totalPrice = " + totalPrice +
                ", ifItsPersian = " + ifItsPersian +
                '}';
    }
}
