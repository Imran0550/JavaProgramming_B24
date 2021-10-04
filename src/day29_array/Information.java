package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class Information {
    public static void main(String[] args) {

        String [] studentOne = {"001", "james", "Bond", "7"};
        String [] studentTwo = new String[4];
        studentTwo[0] = "02";
        studentTwo[1] = "Mr";
        studentTwo[2] = "Smith";
        studentTwo[3] = "24";
        System.out.println(Arrays.toString(studentOne));
        System.out.println(Arrays.toString(studentTwo));

        Scanner input = new Scanner(System.in);

        String [] studentThree = new String[4];
        System.out.println("Enter your id");
        studentThree[0] = input.next();
        System.out.println("Enter your first name");
        studentThree[1] = input.next();
        System.out.println("Enter your last name");
        studentThree[2] = input.next();
        System.out.println("Enter your batch number");
        studentThree[3] = input.next();

        System.out.println(Arrays.toString(studentThree));

    }
}
