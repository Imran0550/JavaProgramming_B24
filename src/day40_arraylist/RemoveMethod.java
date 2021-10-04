package day40_arraylist;

import java.util.ArrayList;

public class RemoveMethod {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("wind");
        list.add("wood");
        list.add("sun");
        list.add("water");

        System.out.println(list);

        list.remove(0); // remove the first element
        System.out.println(list);

        list.remove(list.size()-1); // removes the last index
        System.out.println(list);

        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(40);
        nums.add(80);
        System.out.println(nums);

        int firstRemoved = nums.remove(0);
        System.out.println("first removed element " +firstRemoved);
        nums.add(firstRemoved);
        System.out.println(nums);
    }
}
