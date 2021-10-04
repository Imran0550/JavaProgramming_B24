package day30_array;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 5};

        for(int i = 0; i < nums.length; i++){
            int eachNumber = nums[i];
            System.out.println("number " + nums[i]);
        }
        System.out.println();

        for(int eachNumber: nums){
            System.out.println("number " + eachNumber); // eachNumber = nums [i]
        }
        System.out.println();

        String [] strs = {"Java", "selenium", "db", "api"};

        for(int i = 0; i < strs.length; i++){
            System.out.println(strs[i]);
        }
        System.out.println();
        for(String word : strs){
            System.out.println(word);
        }

        // my own practice;

        int [] num2 = {1, 2, 4, 6};
        for(int i = 0; i < num2.length; i++){
            System.out.println(num2[i]);
        }
        System.out.println();
        for(int eachNum : num2){
            System.out.println(eachNum);
        }

    }
}
