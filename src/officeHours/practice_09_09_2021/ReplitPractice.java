package officeHours.practice_09_09_2021;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitPractice {


    public static int [] merge(int [] a , int[]b){

        int [] merged = new int [a.length + b.length];

        for(int i =0; i < merged.length;i++){

            if(i <a.length){
                merged[i] = a[i];
            }else {
                merged[i] = b[i - a.length];
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        int [] c = {1,2,3};
        int [] d = {2,3};
        System.out.println(Arrays
        .toString(merge(c,d)));
    }

}
