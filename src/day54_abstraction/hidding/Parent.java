package day54_abstraction.hidding;

public class Parent {

    public static void hello(){
        System.out.println("Hello from parent");
    }

}

class Child extends Parent{

    public static void hello(){
        System.out.println("Hello from Child");
    }

    }



class Main{
    public static void main(String[] args) {
        Parent.hello();
        Child.hello();
    }
}