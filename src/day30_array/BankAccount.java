package day30_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {

        /*
           String array
           0 - First name
           1 - account number
           2 - balance
           3 - account type.
         */

        String[] bankAccount = {"Sayid Imran", "435043362969", "20.99", "Saving"};

        System.out.println(Arrays.toString(bankAccount));

        String [] bankAccountTwo = new String [4];
        bankAccountTwo [0] = "Sayid Imran";
        bankAccountTwo [1] = "0510000017";
        bankAccountTwo [2] = "10000000.9";
        bankAccountTwo [3] = "Checking";
        System.out.println(Arrays.toString(bankAccountTwo));

        System.out.println();
        Scanner input = new Scanner(System.in);

        String [] bankAccountThree = new String[4];
        System.out.println("Enter you first name");
        bankAccountThree [0] = input.next();
        System.out.println("Enter you account number");
        bankAccountThree [1] = input.next();
        System.out.println("Enter balance");
        bankAccountThree [2] = input.next();
        System.out.println("Enter account type");
        bankAccountThree [3] = input.next();

        System.out.println(Arrays.toString(bankAccountThree));

        // dynamic scanner input with arrays

        String [] bankAccountFour = new String[4];
        String [] questions = {"first name", "account number", "balance", "account type"};

        for(int i = 0; i< bankAccount.length; i++){
            System.out.println("Enter your " + questions[i]);
            bankAccountFour[i] = input.next();

        }
        System.out.println(Arrays.toString(bankAccountFour));

        // my own practice.

        String [] bankAccountFive = new String[5];
        System.out.println("Enter your first name");
        bankAccountFive[0] = input.nextLine();
        input.nextLine();
        System.out.println("Enter your last name");
        bankAccountFive [1] = input.nextLine();
        System.out.println("Enter your bank name");
        bankAccountFive [2] = input.nextLine();
        System.out.println("Enter your account number");
        bankAccountFive [3] = input.nextLine();
        System.out.println("Enter your routing number");
        bankAccountFive [4] = input.nextLine();
        System.out.println(Arrays.toString(bankAccountFive));



    }
}
