package MyPractices;

import java.util.Scanner;

public class Practice1 {
    public static int wordCount(String words) {
        // your code

        int wordCount = 1;

        for(int i=0; i < words.length();i++){

            if(words.charAt(i) == ' '){
                wordCount++;
            }
        }
return wordCount;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
