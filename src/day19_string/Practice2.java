package day19_string;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter word");
      String word = s.next();
        System.out.println(s.nextLine());
        System.out.println("enter sen");
      String sentence = s.nextLine();

        System.out.println(sentence.contains(word));
        System.out.println();

        // we will find the last character of the word.

        String word2 = s.next();
        int countOf = word2.length();
        int lastChar = countOf -1;
        char lastC = word2.charAt(lastChar);
        System.out.println(lastC);


    }
}
