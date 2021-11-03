package day01_MyPractice;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        AbstractList<String> list = new ArrayList<>();

        list.add("Tomato");
        list.add("Orange");
        list.add(0,"potato");
        list.remove(0);
        list.add(1,"Tumi");

        System.out.println(list);
        System.out.println(list.contains("cheese"));

        System.out.println(list.get(0));
        ArrayList<String> list1 = new ArrayList<>();

        list1.addAll(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(200);
        list2.add(1000);
        list2.add(300);

        System.out.println(list2);

        System.out.println(list2.set(0,100000));
        System.out.println(list2);

    }
}
