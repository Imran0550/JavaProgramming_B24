package MyPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {

    public static ArrayList<Integer> nums(ArrayList<Integer> nums) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int each : nums) {

            int count = Collections.frequency(nums , each);

                if(count ==1){
                    list.add(each);
                }



        }
        return list;
    }



    public static void main(String[] args) {
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,2,3,2,3,5,6));

        System.out.println(nums(nums2));



    }
}
