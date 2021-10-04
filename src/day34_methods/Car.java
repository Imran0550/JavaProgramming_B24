package day34_methods;

public class Car {


        /*
        Algorithm to start a car

        Unlock and open the door
        Get into the car and close door
        Put seatbelt on
        Check mirrors
        Start car
        Put into drive and press gas petal
         */


    public static void unlockAndOpenDoor(){
        System.out.println("unlock and open the door");
    }
    public static void getIntoCarAndCloseTheDoor(){
        System.out.println("Get into the car and close the door");
    }
    public static void putOnSeatBelt(){
        System.out.println("Put seatbelt on");
    }
    public static void checkMirrors(){
        System.out.println("Checking the left mirror");
        System.out.println("Checking the right mirror");
        System.out.println("Checking the rear view mirror");
    }
    public static void startCar(){
        System.out.println("Putting key in and turn to start i");
    }
    public static void drive(){
        System.out.println("Put ther car into drive and press the gas pedal");
    }

    public static void main(String[] args) {
        unlockAndOpenDoor();
        getIntoCarAndCloseTheDoor();
        putOnSeatBelt();
        checkMirrors();
        startCar();
        drive();

    }
}
