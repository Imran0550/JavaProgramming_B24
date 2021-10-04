package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for(int i = 0; i < words.length; i++){
            String each = words[i];
            System.out.print(each.charAt(0));
            System.out.println(each.charAt(each.length()-1));






        }




















    }
}
