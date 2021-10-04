package day05_variables;

public class CellPhone {

    public static void main(String[] args) {


        String brand = "apple";
        String model = "12 pro max";
        String color = "Gray";
        double price = 1200.90;
        int storage = 50;
        boolean hasCamera = true;

        color = "Silver"; // reassigned

        System.out.println("information for the: " + model);
        System.out.println( model + " is a " + brand + " phone");
        System.out.println(" this phone come is " + color + " and has " + storage + " GB of memory");
        System.out.println(" has a camera: " + hasCamera);
        System.out.println("All of this for $" + price);

        System.out.println(brand + " " + model); // put between

       // approach two:

        String info = "\t\t\tInformation for the " + model+ "\n" + model + " is a " + brand + " phone" + " this phone come is " + color + " and has " + storage + " GB of memory" + " has a camera: " + hasCamera + "\nAll of this for $" + price;

        System.out.println(info);

    }
}
