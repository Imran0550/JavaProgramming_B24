package day54_abstraction.hidding;

public class A {

       public static void staticMethod(){
           System.out.println("A");
       }

       public void instanceMethod(){
           staticMethod();
       }
}
