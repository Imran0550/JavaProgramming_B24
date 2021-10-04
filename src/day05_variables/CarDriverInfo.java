package day05_variables;

public class CarDriverInfo {
    public static void main(String[] args) {

        String carModel = "Chevy";
        String driverName = "Imran";
        String licenseNum = "B63757";
        short speed = 180;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        System.out.println(driverName + " has a " + carModel + " with license number: " + licenseNum + " and his license class is " + licenseClass + " it can go " + speed + "MPH");
        System.out.println("The car is automatic: " + isAutomatic);

    }
}
