package day33_multidimensional_array;

import java.util.Arrays;

public class multidimensionalArray2 {
    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30, 40},
                {100, 200, 300, 400},
                {1000, 2000}

        };
        System.out.println(arr[0].length);
        System.out.println(Arrays.toString(arr[0])); // this is the length of the first single array

        System.out.println(arr[1].length);
        System.out.println(Arrays.toString(arr[1]));

        System.out.println(arr[2].length);// this is the length of the first single array
        System.out.println(Arrays.toString(arr[2]));

        System.out.println("First array: " + arr[0][0]); // reads the first element of first single array
        System.out.println("Second array: " + arr[1][0]);
        System.out.println("third array: " + arr[2][0]);

        // own practice;

        int [][] arr2 ={
            {10,4,3},
                {3,60,90},
        };

        System.out.println(arr2[0].length);
        System.out.println(Arrays.toString(arr2[0]));
        System.out.println("First array is: " + arr2[0][0]);










       }

    }