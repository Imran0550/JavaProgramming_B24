package day02_print_statements;

import day49_encapsulation.AccessModifier;

public class ComeBackFromFuture {

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        obj.a = 30;
     ///   obj.b= 40;// b is default so it only can be accessed in the same package
       // obj.c = 50; // c is private, cannot be accessed outside the class.



    }
}
