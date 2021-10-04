package day23_loops;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        /*
        there is a number predefined
        1-100

        we want the user to guess

        80

        -> 50
          50 is too small

          -> 90 is too big

         */

        Scanner s = new Scanner(System.in);

        int secretNumber = 80;
        int userGuess;
        int attempts = 0;

        do{
            System.out.println("Guess a number");
            userGuess = s.nextInt();
            attempts++;

            // this if statement checks for valid inputs of number from 1 - 100

            if(userGuess > 0 && userGuess <= 100 ) {

                if (userGuess == secretNumber) {
                    // this if statement tell the user how close the guess is
                    System.out.println("Good guess! the number was: " + secretNumber);
                } else if (userGuess < secretNumber) {
                    System.out.println(userGuess + " is too small");
                } else if (userGuess > secretNumber) {
                    System.out.println(userGuess + " is too big");
                }
            }else {
                System.out.println("Invalid number, needs to be between 1 - 100");
            }
        }while(userGuess != secretNumber); // keep running the above code(keep running the loop) until the user get the right number.

        if(attempts <= 2){
            System.out.println("really good guess");
        }else if(attempts <=4){
            System.out.println("still good guess");
        }else{
            System.out.println("alot of guesses but you got it");
        }

    }
}
