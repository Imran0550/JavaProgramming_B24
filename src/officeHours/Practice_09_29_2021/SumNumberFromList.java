package officeHours.Practice_09_29_2021;

import java.util.ArrayList;

public class SumNumberFromList {


      /*  String numbers to sum
        Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.
                Ex:
        Input:
“123”, “34”, “513” Output:
[ 6, 7, 9 ]

       */
      public static void main(String[] args) {


      }

    public static ArrayList<Integer> getNumOfString(ArrayList<String> list){

        ArrayList<Integer> number = new ArrayList<>();

        for(String each : list){
            int sum =0;
            for(int i =0; i < each.length(); i++){
                sum += Integer.parseInt("" +each.charAt(i));

            }
            number.add(sum);
        }
        return number;
    }
    // challenge: extract the inner loop, make it a helper method
    

}
