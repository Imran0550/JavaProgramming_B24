package day54_abstraction.hidding;

public class B extends A{

    public static void staticMethod(){
        System.out.println("A");
    }
    public static void instanceMethodB(){
        staticMethod();
    }
}
