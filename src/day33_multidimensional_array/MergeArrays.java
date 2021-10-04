package day33_multidimensional_array;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {


        int [][] nums = {

                {10,20,30}, {5,10,15}
        };

        // task: takes the element from the 2d array and put the numbers into a single array.
        // format : all elements from first, then all from second etc...

        int size = nums[0].length + nums[1].length;

        int [] merged = new int [size];
        merged[0] = nums[0][0]; // [ 10 , 20 ,30, 5, 10, 15]
        merged[ 1] = nums[0][1];
        merged[2] = nums[0][2];
        merged[3] = nums[1][0];
        merged[4] = nums [1][1];
        merged[5] = nums [1][2];

        System.out.println(Arrays.toString(merged));

        System.out.println();

        int [][] values = {
                {1,2,5}, {1,23,6}
        };
        int size2 = nums[0].length + nums[1].length;

        int [] merge2 = new int[size2];

        merge2[0] = values[0][0]; //1,  so all of them is now merged and will give me {1,2,5,1,23,6}
        merge2[1] = values[0][1];// 2,
        merge2[2] = values[0][2]; // 5,
        merge2[3] = values[1][0];//1
        merge2[4] = values[1][1]; // 23
        merge2[5] = values[1][2]; // 6

        System.out.println(Arrays.toString(merge2));


    }
}
