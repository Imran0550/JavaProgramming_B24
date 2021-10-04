package day34_methods;

import java.util.Scanner;

public class Practice2 {

    public static void myName(String name){
        System.out.println("My name is " + name + " nice to see u");
    }
    public static void myAge(int age){
        System.out.println("I'm " + age + " years old");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your name");
        String name = input.next();
        System.out.println("Your age");
        int age = input.nextByte();

        myName(name);
        myAge(age);


    }
}
