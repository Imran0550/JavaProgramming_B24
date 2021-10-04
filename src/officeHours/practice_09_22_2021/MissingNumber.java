package officeHours.practice_09_22_2021;

import java.util.Arrays;

public class MissingNumber {

    /*
    get an array of numbers from 1 to 9

    [ 1, 2, 4, 5, 6, 7, 8, 9 ]

     find the missing number

     -> 3

     */
    public static void main(String[] args) {

        int [] arr= {60,62,63};

        System.out.println(findMissingNumber(arr));
    }

    public static int findMissingNumber(int [] nums){

        Arrays.sort(nums);

        int checking = 1;

        for(int each : nums){
            if(checking != each){
                break;

            }
            checking++; // updates checking number every iteration
        }
return checking;
    }



}
