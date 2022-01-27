package day01_MyPractice.CodingBat;

import java.util.HashSet;

public class JustForFun {


    public static void main(String[] args) {


        String s = "894ujdfka";


        int num = Integer.parseInt(s.substring(0,3));
        System.out.println(num);

        String [] arr = s.split("");

       int sum =0;

       for(int i=0;i<s.length();i++){
           if(Character.isDigit(s.charAt(i))){
               sum += s.charAt(i);
           }
       }

        System.out.println(sum);
    }
}
