package day39_wrapper_arraylist;

import java.util.Scanner;

public class CountCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scan.next();

        int upper =0, lower =0, num= 0, others =0;

        for(char each : email.toCharArray()){

            if(Character.isUpperCase(each)){
                upper++;
            }else if(Character.isLowerCase(each)){
                lower++;
            }else if(Character.isDigit(each)){
                num ++;
            }else{
                others++;
            }
        }


        System.out.println("Uppercase: "+ upper);
        System.out.println("lowercase: "+ lower);
        System.out.println("Digits: " + num);
        System.out.println("Others: "+ others);




    }
}
