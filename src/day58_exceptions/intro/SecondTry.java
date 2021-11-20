package day58_exceptions.intro;

import java.io.InvalidClassException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTry {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
try {


    System.out.println("Enter a number");
    int num = scan.nextInt();
    System.out.println("Enter another number");
    int num2 = scan.nextInt();

    System.out.println(num/num2);

}catch (InputMismatchException e) {
    System.out.println("We wanted a number");
}catch (ArithmeticException e){
    System.out.println(e.getMessage());
}

    }
}
