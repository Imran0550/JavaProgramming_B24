package day58_exceptions.intro;

import java.util.Scanner;

public class UseFinally {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = "";
        
        try {
           name = scan.next();

            System.out.println("Pick a character index");
            System.out.println(name.charAt(scan.nextInt()));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("That was an invalid character, try again");
            System.out.println(name.charAt(scan.nextInt()));
        }
        finally {
            System.out.println("CLOSING STORE!");
            scan.close();
        }
        
    }
}
