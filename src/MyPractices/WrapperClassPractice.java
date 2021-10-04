package MyPractices;

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

        







    }
}
