package day01_MyPractice;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveInstances {

    public static AbstractList<Integer> nums(ArrayList<Integer> list, Integer n){

        for(int i=0;i<list.size();i++){

            if(list.get(i) == n){
                list.remove(i);
                i--;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,5,5,5,6,7));

        System.out.println(nums(nums,5));


    }
}
