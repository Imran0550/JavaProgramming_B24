package officeHours.practice_09_16_2021;

import java.util.Arrays;

public class MergeArrays {

    /*

    {1,2,3}
    {10, 20,30}

    first case:
      output: 1,2,3,10,20,30

     */

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {10, 20, 30};

        int mergeLength = arr1.length + arr2.length;

       int [] merged = Arrays.copyOf(arr1, mergeLength);

        int index = arr1.length;

        for(int num : arr2) {
            merged[index++] = num;
        }

        System.out.println(Arrays.toString(merged));

    }
    }

