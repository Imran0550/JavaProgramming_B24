package day43_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        ArrayList<String> first = new ArrayList<>();

        first.add("Water");
        first.add("items");
        first.add("run");

        ArrayList<String> second = new ArrayList<>(first);
        second.add("pen");

        System.out.println(first + "\n" + second);

        ArrayList<String> third = new ArrayList<>(Arrays.asList("one" , "two" , "three"));
        System.out.println(third);

    }
}
