package my_utilities;

import day51_inheritance.Modifier;

public class MyTestModifierOutsidePackage {
    public static void main(String[] args) {


        Modifier modifier = new Modifier();

        System.out.println(modifier.A);

      //  System.out.println(modifier.B); cannot be accessed because it is protected, and we are in a different package

       // System.out.println(modifier.C); cannot be accessed because it is default, and we are in a different package

        // System.out.println(modifier.D); cannot be accessed because it's private.
    }
}
