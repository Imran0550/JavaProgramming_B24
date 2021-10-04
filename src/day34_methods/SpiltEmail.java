package day34_methods;

import java.util.Scanner;

public class SpiltEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = scan.nextLine();

        if(!email.contains("@")){
            System.out.println("invalid email");
        }else{

            String [] arr = email.split("@");

            //info@cybertek.com // after you split
            //  1  /   2
            // arr[0]/ arr[1]

            if(arr.length == 2){

                System.out.println("Email id: " + arr[0]);
                System.out.println("Email domain: " + arr[1]);


            }else{
                System.out.println("invalid email");
            }
        }

    }
}
