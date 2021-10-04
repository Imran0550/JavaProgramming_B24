package day38_methods;

import java.util.Arrays;

public class OverloadPractice {

    public static int findMax(int [] arr){

        int max = arr[0];
        for(int x =0; x < arr.length; x++){

            if(arr[x] > max){
                max = arr[x];
            }

        }
        return max;


    }
    public static double findMax(double [] arr){

        double max = arr[0];
        for(double j =0; j < arr.length; j++){

            if(arr[(int) j] > max){
                max = arr[(int) j];
            }

        }
        return max;


    }

    public static void main(String[] args) {

        int [] arr ={1,2,45,67,8};
        System.out.println(findMax(arr));

        double [] arr2 = {0.2,0.9,10.99};
        System.out.println(findMax(arr2));

        int [] arr3 ={1,2,3,45,3};
        arr3[2] = arr3[4];
        arr3[4] = 90;
        System.out.println(Arrays.toString(arr3));

    }

}
