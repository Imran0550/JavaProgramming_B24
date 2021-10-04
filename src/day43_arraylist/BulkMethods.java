package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.addAll(Arrays.asList(2,3,4,5,6,7,7,7));

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(10,20));

       // nums.add(other.get(0));
      //  nums.add(other.get(1));
        nums.addAll(0, other); //puts all the values of the other ArrayList starting from index 0

        System.out.println(nums);
        System.out.println(other);
     //   Integer five =0;
     //   nums.remove(five);
        nums.removeAll(Arrays.asList(5,10,7)); // this line removes all the 5's and 10's from the ArrayList.
        System.out.println(nums);

        // Q: What if you try to remove an element that is not in your ArrayList
        System.out.println(nums.removeAll(Arrays.asList(30)));
    }
}
