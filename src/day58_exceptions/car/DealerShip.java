package day58_exceptions.car;

import java.util.ArrayList;

public class DealerShip {
    public static void main(String[] args) {


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BMW());
        cars.add(new Ford());
        cars.add(new Model3());
        cars.add(new Tesla());

        BMW car5 = new BMW();
        cars.add(car5);

        lease(car5);
       lease(new Tesla());
       lease(new BMW());
       lease(new Ford());
       lease(new Model3());

        Ford ford = (Ford) getCar(3);
        Car car = getCar(1);
        BMW car7 = (BMW) car;

        BMW car8 = (BMW) getCar(2);


    }

    public static void lease(Car car){

        System.out.println("Leasing car");

    }

    public static Car getCar(int options){
        if (options ==1){
            return new BMW();
        }else if(options == 2){
            return new Tesla();
        }else if(options ==3){
            return new Ford();
        }else {
            return new Model3();
        }
    }
}
