package officeHours.practice_09_15_2021;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        /*

        Reverse Each word
Given a String, reverse each individual word and print the result Hint: Use a nested loop, split
Input:
It started to snow in Chicago Output:
tI detrats ot wons ni ogacihC
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word seperated by a space");
        String original = scan.nextLine().trim();

        String
                []
                words
                =
                original
                        .
                        split
                                (" ") ;

        String result = " ";

        for(String eachWord : words){


            String reverse = " ";
            for(int i = eachWord.length()-1; i >=0; i--){
                reverse += eachWord.charAt(i);

            }
            result += reverse + "";
        }
        System.out.println("original: " + original);
        System.out.println("reversed: " + result);



    }
}
