package day40_arraylist;

import my_utilities.ArraysUtil;

import java.util.ArrayList;

public class RemoveByValue {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("pen");
        list.add("mouse");
        list.add("mouse");
        list.add("marker");
        System.out.println(list);

      boolean removed = list.remove("mouse"); // this gonna remove mouse from the Arraylist
        System.out.println(removed);

        boolean removed2 = list.remove("hat");
        System.out.println(removed2);
        System.out.println(list);



    }
}
