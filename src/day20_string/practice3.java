package day20_string;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {

        /*
        ng:

When word has odd number of characters and:
3 or more characters, print middle letter
      oak ==> a

      javav ==> v

Single character, print that character 3 times
      # ==> ###

      q ==> qqq

When word has even number of characters and:
4 or more characters, print the middle 2 characters
     java ==> av

     apples ==> pl

     #$%^&* ==> %^

2 characters, print those 2 characters twice
      @@ ==>@@@@

      $$ ==>$$$$

      hi ==> hihi
      REAMINDER // if scanner is used first find the length of the word
         */
        Scanner input = new Scanner(System.in);
        String word = input.next();

        int charCount = word.length();
        int middleIndex = charCount / 2; // med 3 / 2 = 1

        if (charCount == 1) {
            System.out.println(word + word + word);
        } else if (charCount == 2) {
            System.out.println(word + word);
        } else if (charCount >=3){
            middleIndex = charCount / 2; // medii =
            if(charCount % 2 == 1){
                System.out.println(word.charAt(middleIndex));
            }else {
                System.out.println(word.substring(middleIndex -1, middleIndex  +1));
            }


        }

    }
}
