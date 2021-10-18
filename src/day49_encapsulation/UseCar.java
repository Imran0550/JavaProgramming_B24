package day49_encapsulation;

import java.util.Arrays;

public class UseCar {

    public static void main(String[] args) {
        Car car = new Car("imran","64627usi", 90);

        System.out.println(car.driver);
        System.out.println(car.driver.name);
        System.out.println(car.driver.age);

        Car car1 = new Car("Adam", "2345id",35);
        System.out.println(car1.driver);
    }
}
