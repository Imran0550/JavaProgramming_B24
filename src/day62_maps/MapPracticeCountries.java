package day62_maps;

import java.util.*;

public class MapPracticeCountries {

    public static void main(String[] args) {

        Map<String , ArrayList<String>> map = new HashMap<>();
        // key is a String - each country
        // value is an ArrayList of String - each holds all teh cities in that country

        List<String>  list= new ArrayList<>();
        list.add("Chicago");
        list.add("New york");
        list.add("Arlington");

        map.put("North America",(ArrayList<String>) list);

        System.out.println(map);

        Map<String, ArrayList<String>> map1 = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Rome");
        list1.add("Istanbul");
        list1.add("Berlin");

        map1.put("Europe", (ArrayList<String>) list1);
        System.out.println(map1);

        Map<String, ArrayList<String>> map2 = new HashMap<>();
        // different approach from the above

        map2.put("Asia", new ArrayList<>(Arrays.asList("Kabul","Seoul","Islamabad","beijing")));
        System.out.println(map2);


        for(String continent : map2.keySet()){ // first loop goes through the keys which are continents

            for(String city : map2.get(continent)){ // second loop goes through the cities which are ArrayList value
                System.out.println(city);
            }


        }



    }
}
