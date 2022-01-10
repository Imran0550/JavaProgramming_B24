package oop.walmart;

public class Ahmad extends Employee implements eating{


    @Override
    public void eating() {
        System.out.println("Good eater");
    }
}
