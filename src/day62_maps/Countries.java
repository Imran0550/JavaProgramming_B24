package day62_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Countries {


    public static void main(String[] args) {

        Map<String , ArrayList<String>> listMap = new HashMap<>();

        listMap.put("North America",new ArrayList<>(Arrays.asList("Fredericksburg","New Orleans","Chicago","Vegas")));
        listMap.put("Asia", new ArrayList<>(Arrays.asList("Kabul","Islamabad","Seoul")));
        listMap.put("Europe", new ArrayList<>(Arrays.asList("Moscow","Istanbul","Sivas")));
        System.out.println(listMap);

        int count = 0;

        for(String each : listMap.keySet()){

            System.out.println("The cities in " + each + listMap.get(each));
            // ^ or but only can be true
            // true ^ false ->true
            // false ^ true -> true
            // true ^ true -> false
        }

    }
}
