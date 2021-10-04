package day33_multidimensional_array;

import java.util.Arrays;

public class RecapArraysClass {

    public static void main(String[] args) {


        int [] arr = {1, 4, -4, 60, -100, 30};

        int [] arr2 = {1, 60, -4, 4, -100, 30};
        System.out.println(Arrays.equals(arr,arr2));

        Arrays.sort(arr);
        Arrays.sort(arr2);




        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.equals(arr,arr2));
    }


}
