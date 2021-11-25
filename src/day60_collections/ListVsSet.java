package day60_collections;

import officeHours.practice_09_08_2021.HasJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ListVsSet {
    public static void main(String[] args) {

        ArrayList<String > list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add(null);
        System.out.println(list);

        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("c");
        set.add(null);
        //set.get(0);

        for (String each : set) {
            System.out.println(each);
        }

        HashSet set1 = new HashSet<>(list);
        System.out.println("set1 = " + set1);

    }


}
