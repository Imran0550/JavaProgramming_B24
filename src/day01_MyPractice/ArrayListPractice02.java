package day01_MyPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice02 {

    public static int anInt( String str) {

        String[] arr2 = str.split("");

        for (int i = 0; i < arr2.length-1; i++) {
           int count =0;

           for(int x=0;x<arr2.length;x++){

               if(str.charAt(x) == str.charAt(i)){
                   count++;
               }
           }
            return count;
        }
       return 0;
    }
    public static void main(String[] args) {

        String [] ar = {"1","4","7"};
        System.out.println(anInt("bdyabbb"));
       }

}
