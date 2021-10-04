package day38_methods;

import my_utilities.ArraysUtil;

public class ArraySum {

    /*

      Create a method that will take an array and return the sum of all elements

     */
    public static void main(String[] args) {
        int [] a = {1,2,356,7,8};
        System.out.println(sum(a));


    }

    public static int sum(int [] arr){

        int sum = 0;

        for(int i =0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}
