package day56_polymorphism.transportation;

import java.util.AbstractList;
import java.util.ArrayList;

public class Road {
    public static void main(String[] args) {

        Transportation obj1 = new Transportation();
        obj1.go();

        // car objects

        Car obj2 = new Car();
        obj2.go();
        obj2.openTrunk();

        System.out.println();
       Transportation obj3 = new Car();
       obj3.go();
      // obj3.openTrunk(); Transportation reference for the car does not have access to the openTrunk method

    Tesla t1 = new Tesla();

    Car t2 = new Tesla();

    Transportation t3 = new Tesla(); // super

     SelfDriving t4 = new Tesla();

     Electric t5 = new Tesla();
     t5.Charge();

    }
}
