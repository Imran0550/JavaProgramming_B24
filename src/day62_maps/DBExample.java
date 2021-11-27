package day62_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBExample {
    public static void main(String[] args) {

       /*

            Person

                key        value
             <FIRST_NAME> James
             <LAST_NAME> Bond
             <AGE> 40


        */

        HashMap<String, String > map = new HashMap<>();
        map.put("FIRST_NAME","James");
        map.put("SECOND_NAME","Bond");
        map.put("AGE","40");

        ArrayList<Map<String,String>> allPeople = new ArrayList<>();
        allPeople.add(map);

        // I want to know the first name
        System.out.println(allPeople.get(0).get("FIRST_NAME"));


    }
}
