package day05_variables;

public class WatchInfo {
    public static void main(String[] args) {

        // Watch info
        // brand, color, price, waterResistant, isSmart

        String brand = "Royal";
        String color = "White";
        int price = 1000;
        int waterResistant = 100;
        boolean isSmart = true;

        System.out.println("Info about my watch: ");

        System.out.println("The brand is a  " + brand  + " and I bought it around $" + price);

        System.out.println("It is " + color + " and can can resist upto " + waterResistant + "m: " + isSmart );

        // approach two

        String Info = "Info about my watch: " + "The brand is a  " + brand  + " and I bought it around $" + price + "It is " + color + " and can can resist upto " + waterResistant + "m: " + isSmart;







    }


}
