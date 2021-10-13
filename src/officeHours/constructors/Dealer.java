package officeHours.constructors;

public class Dealer {
    public static void main(String[] args) {


        Car car = new Car("toyota");
        System.out.println(car);
        car.model = "corolla";
        System.out.println(car);

        Car newCar = new Car("Benz","Equinox",2021,150_000,"white");
        System.out.println(newCar);
    }
}
