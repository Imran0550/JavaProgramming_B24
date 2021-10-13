package officeHours.constructors;

public class Computer {

    double price;
    String brand;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    public Computer(double price, String brand, String color){
        this.price = price;
        this.brand = brand;
        this.color = color;
    }

    static {
        hasBattery = false;
        hasMemory = true;
        hasScreen = true;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
