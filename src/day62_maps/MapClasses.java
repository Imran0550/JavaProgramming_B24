package day62_maps;

import java.util.*;

public class MapClasses {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(2,"two");
        map.put(4,"four");
        map.put(1,"one");
        map.put(5,"five");
        map.put(3,"three");
        System.out.println(map);

        Map<Integer, String> map1 = new LinkedHashMap<>();

        map1.put(2,"two");
        map1.put(4,"four");
        map1.put(1,"one");
        map1.put(5,"five");
        map1.put(3,"three");
        System.out.println(map1);


        Map<Integer, String> map2 = new TreeMap<>();

        map2.put(2,"two");
        map2.put(4,"four");
        map2.put(1,"one");
        map2.put(5,"five");
        map2.put(3,"three");
        System.out.println(map2);


        Map<String, String> map4 = new HashMap<>();

        map4.put("apple","juice");
        map4.put("water","pool");
        map4.put("computer","chip");
        map4.put("Zebra","Zoo");
        map4.put("Class","java");
        map4.put(null,"empty");


        Map<String, String> map5 = new TreeMap<>();

        map5.put("apple","juice");
        map5.put("water","pool");
        map5.put("computer","chip");
        map5.put("Zebra","Zoo");
        map5.put("Class","java");
       // map5.put(null,"empty"); tree map does not accept null key



        Map<String, String> map6 = new LinkedHashMap<>();

        map6.put("apple","juice");
        map6.put("water","pool");
        map6.put("computer","chip");
        map6.put("Zebra","Zoo");
        map6.put("Class","java");
        map6.put(null,"empty");

        System.out.println("String keyed HashMap: " + map4);
        System.out.println("String keyed TreeMap: " + map5);
        System.out.println("String keyed LikedHashMap: " + map6);




    }

}
