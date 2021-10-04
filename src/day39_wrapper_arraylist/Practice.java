package day39_wrapper_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

        int upper =0, lower =0, num =0, other =0;

        for(int i = 0; i < sentence.length(); i++){

            if(Character.isUpperCase(sentence.charAt(i))){
                upper++;
            }else if(Character.isLowerCase(sentence.charAt(i))){
                lower++;
            }else if(Character.isDigit(sentence.charAt(i))){
                num++;
            }else {
                other++;
            }
        }

        System.out.println("uppercase: " + upper);
        System.out.println("lowercase: "+ lower);
        System.out.println("digit: " + num);
        System.out.println("others: " + other);

        System.out.println();

        if(sentence.endsWith("in")){
            System.out.println("good sentence");
        }else {
            System.out.println("Not bad");
        }
        System.out.println();
        String reverse =" ";
        for(int i = sentence.length()-1; i >=0; i--){
            reverse += sentence.charAt(i);
        }
        System.out.println(reverse);

        System.out.println();

        System.out.println(sentence.isEmpty());

        if(sentence.contains("Afghanistan")){
            System.out.println("Good country");
        }else {
            System.out.println("Try another country");
        }
        System.out.println();

        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));

        System.out.println(sentence.replace('a','A'));













    }
}
