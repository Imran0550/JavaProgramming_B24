package MyPractices;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitPractice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int innerSize = scan.nextInt();
        int outerSize = scan.nextInt();
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];

        for(int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }

        for(int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);

        //WRITE YOUR CODE HERE

        /*
        Given two arrays of ints sorted in increasing order, outer and inner, print out true if all of the numbers in inner appear in outer. Take advantage of the fact that both arrays are already in sorted order.
         */
int count =0;
      for(int eachInner : inner){

          for(int eachOuter : outer){

              if(eachInner == eachOuter){
                  count++;
              }
          }
      }
        System.out.println(count == innerSize);







    }
}
