package my_utilities;

import day51_inheritance.Modifier;

public class TestModifierWithInheritance extends Modifier {


    public static void main(String[] args) {

        Modifier modifier = new Modifier();

        System.out.println(modifier.A);
       // System.out.println(modifier.B);cannot be accessed; protected

      //  System.out.println(modifier.C); can only be accessed inside the package,

        // System.out.println(modifier.D); cannot be accessed because it's private.

        TestModifierWithInheritance modifierWithInheritance = new TestModifierWithInheritance();

        System.out.println( modifierWithInheritance.A);
        System.out.println(modifierWithInheritance.B);
    }

}
