package day40_arraylist;

import java.util.ArrayList;

public class ClassRoom {

    public static void main(String[] args) {

        ArrayList<String> group1 = new ArrayList<>();

        System.out.println(group1);
        System.out.println(group1.size());// how many elements is there

        group1.add("Vindar");
        group1.add("Imran");
        group1.add("Didora");
        group1.add("Topcu");
        System.out.println(group1);

        System.out.println("First element: " + group1.get(0));
        System.out.println("Second element: " + group1.get(1));
        System.out.println("Third element: " + group1.get(2));
        System.out.println("Fourth element: " + group1.get(3));

        System.out.println("first element, first char: " + group1.get(0).charAt(0));
        System.out.println();


        ArrayList<String> group2 = new ArrayList<>(20);
        System.out.println(group2.size());

        System.out.println();


        ArrayList<String> group3 = new ArrayList<>();
        group3.add("Nisso");
        group3.add(0, "Omer");
        group3.add("Kamila");
        group3.add(0,"Imran");

        System.out.println(group3);

        System.out.println();

        // my practice

        ArrayList<String> groupThree = new ArrayList<>();
        System.out.println(groupThree);
        System.out.println(groupThree.size());

        groupThree.add( "Imran") ;
         groupThree.add("Khan");
         groupThree.add(1,"saim");
         groupThree.add(0, "Afg");
        System.out.println(groupThree);
        System.out.println(groupThree.size());

        System.out.println();

        ArrayList<Integer> num = new ArrayList<>();
        System.out.println(num);

        num.add(30);
        num.add( 9);
        num.add( 10);
        num.add(40);
        System.out.println(num);

        num.remove(0);
        System.out.println(num);

        System.out.println("First num: " + num.get(0));
        System.out.println("Second num: " + num.get(1));
        System.out.println("Three num: " + num.get(2));
        System.out.println("Fourth num: " + num.get(3));










    }
}
