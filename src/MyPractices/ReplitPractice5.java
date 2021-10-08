package MyPractices;

import java.util.Scanner;

public class ReplitPractice5 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("enter number");
        int num = inp.nextInt();

        next3(num);
    }

    // Do not touch above

    /*
    Create a method called next3 . This method has an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it
     */

   public static void next3(int n){

       if(n > 0){
           System.out.println("next 3 are:");
           System.out.println(n+1 + " " + (n+2)+ " " + (n+3));

       }


   }
}
