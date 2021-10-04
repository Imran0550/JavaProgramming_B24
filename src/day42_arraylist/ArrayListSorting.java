package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {

        // How did you sort arrays?????

        // we use Array.sort() : but this method will not work for ArraysList because it's for Arrays

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(40,50,51,10,4,39,90,8));

        Collections.sort(nums);
        System.out.println(nums);
    }
}
