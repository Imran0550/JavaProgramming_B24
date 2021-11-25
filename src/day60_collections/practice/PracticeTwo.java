package day60_collections.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class PracticeTwo {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(10);
        nums.add(11);
        nums.add(11);
        nums.add(3);
        System.out.println(nums);

        System.out.println();

        List<Integer> nums2 = new LinkedList<>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(10);
        nums2.add(11);
        nums2.add(11);
        nums2.add(3);


        System.out.println(nums2);
        System.out.println(nums2.get(0));

        List<Integer> nums1 = new Vector<>();
        nums1.add(1);
        nums1.add(2);
        nums1.add(10);
        nums1.add(11);
        nums1.add(11);
        nums1.add(3);
        System.out.println(nums1);
        System.out.println(nums1.get(0));

    }
}
