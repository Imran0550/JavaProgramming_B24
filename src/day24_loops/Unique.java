package day24_loops;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter a word");
        String word = s.next();
        System.out.println("Enter a letter");
        char letter = s.next().charAt(0);
        int count = 0;

        for(int i = 0; i < word.length(); i++){


            if(word.charAt(i) == letter) {
                count++;
            }


        }
        if(count == 1){
            System.out.println( letter + " is Unique");
        }else if(count == 0){
            System.out.println(letter + " was not in the String");
        }else{
            System.out.println(letter + " is Not unique");
        }



    }
}
