package day18_string;

import java.util.Scanner;

public class Websites {
    public static void main(String[] args) {

        /*
        at the end has
        .com
        .gov
        .edu
        .net
         */
       Scanner input = new Scanner(System.in);
        System.out.println("Enter a website");
        String websiteName = input.nextLine();

        if(websiteName.endsWith(".com") || (websiteName.endsWith(".gov") || (websiteName.endsWith(".edu") ||
                (websiteName.endsWith(".net")))) ){
            System.out.println("opening " + websiteName + " for you");
        }else {
            System.out.println(websiteName + "is invalid, try again!");


        }
        


    }
}
