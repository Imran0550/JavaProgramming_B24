package day20_string;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        /*
        [Account Number]
Declare a variable account number (String). You will check if these account numbers are valid.
- If the account number begins with a “2” the account number should be 7 characters long
Print: "Valid 7-digit account number" Otherwise: "Invalid 7-digit account number"
- If the account number begins with a “5” the account number should be 10 characters long
Print: "Valid 5-digit account number" Otherwise: "Invalid 5-digit account number"
- If the account number does not begin with a 2 or a 5 Print "Invalid account number"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        String accountNumber = input.nextLine();

        if(accountNumber.startsWith("2")) {
            if (accountNumber.length() == 7) {
                System.out.println("Valid 7 digit account number");
            } else {
                System.out.println("Invalid 7 digit account number");
            }
        }else if(accountNumber.startsWith("5")){
            if(accountNumber.length() == 10){
                System.out.println("Valid 10 digit account number");
            }else {
                System.out.println("Invalid 10 digit account number");
            }
        } else{
            System.out.println("Invalid account number");
        }
    }
}
