package day60_collections.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Vector;

public class PracticeOne {

    public static void main(String[] args) {

        ArrayList<String> nums = new ArrayList<>();
        nums.add("a");
        nums.add("a");
        nums.add("z");
        nums.add("#");
        nums.add("0");
        nums.add("e");

        System.out.println(nums);

        //remove duplicates using HashSet

        HashSet set =new HashSet<>(nums);
        System.out.println(set);
        System.out.println();
        HashSet<String> list = new HashSet<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        System.out.println();

        List set1 = new ArrayList<>(list);
        System.out.println(set1);
        System.out.println();
        set1.set(0,"j");
        System.out.println(set1);

        System.out.println();

      List set2 =  new Vector<>(list);
        System.out.println(set2);





    }
}
