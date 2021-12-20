package day01_MyPractice.replit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static Map<String ,Object> map(String str){



        Map<String,Object> map = new HashMap<>();


        String [] arr =str.split("\n");

        for(String each : arr){
            map.put(each.split(":")[0].trim(),each.split(":")[1].trim());
        }

        String s = ((String) map.get("Amount")).split(" ")[0];
        System.out.println(s);




        return map;

    }

    public static void main(String[] args) {
        String s = "Id: 5013375\n" +
                "Amount: 1190 USD\n" +
                "Card Number: 6771-8978-8714-9113\n" +
                "Name: Max Corwin\n" +
                "Date: 18/11/2021\n" +
                "Id: 5013375\n" +
                "Amount: 1190 USD\n" +
                "Card Number: 6771-8978-8714-9113\n" +
                "Name: Max Corwin\n" +
                "Date: 18/11/2021";
        System.out.println(map(s));



    }

}
