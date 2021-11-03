package MyPractices;

import java.util.Arrays;
import java.util.Scanner;

public class WrapperClassPractice {

    public static void main(String[] args) {
      String result ="";
        String s ="303ee3";
      for(char each : s.toCharArray()){

          if(Character.isDigit(each)){
              result += each;
          }
      }
        System.out.println(result);

        System.out.println();


        String s1 = "hsh7838"; //= >26
        String s2 =  "";
        int sum =0;
        for( char each2 : s1.toCharArray()) {

            if (Character.isDigit(each2)) {

                s2 += each2;
            }

        }
        int a = Integer.parseInt(s2);
       // int a = 7838;






    }
}
