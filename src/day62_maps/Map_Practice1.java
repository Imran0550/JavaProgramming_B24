package day62_maps;

import java.util.HashMap;

public class Map_Practice1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        //      <key   , Value
       // map.add(); maps don't have add method, because they don't inherit Collection interface
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");

        System.out.println(map);

        // how can you read from the map

        String name = map.get(2); // this is not index 2 , it is key 2
        System.out.println(name);

        map.put(1,"fuat");
        System.out.println(map);

    }
}
