package day49_encapsulation;

public class Car {

    driver driver;

    public Car(String name, String licenceNumber, int age){
        driver = new driver(name, licenceNumber, age);
    }
}


/*
String driver; // name, licnum, age
String engine; // cylinder , horsePower
 */

class driver{
    String name;
    String licenceNumber;
    int age;

    public driver(String name, String licenceNumber, int age) {
        this.name = name;
        this.licenceNumber = licenceNumber;
        this.age = age;
    }

    @Override
    public String toString() {
        return "driver{" +
                "name='" + name + '\'' +
                ", licenceNumber='" + licenceNumber + '\'' +
                ", age=" + age +
                '}';
    }
}


