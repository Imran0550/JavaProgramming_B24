package officeHours.Practice_09_29_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    /*
    Hide Password
Given an array of passwords (String). Hide each password as a star () and show the hidden password
Ex:
Input:
{"one", "hi", "hold}
Output:
[ **, , ** ]

@Aktolkyn Mamyrbayeva
yes, you need to have remote repo first

     */
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>(Arrays.asList("one", "two","three"));

        System.out.println(hidePassword(str));
    }

    public static ArrayList<String> hidePassword (ArrayList<String> list){

        for(int i =0; i < list.size(); i++){

            String stars = convertToStars(list.get(i));

            list.set(i , stars);
        }
        return list;
    }

    // helper method, separate action refactored out as a method
    public static String convertToStars(String str){

        // one - ***
        // hi - **

        String stars = "";

        for(int i=0; i < str.length(); i++){
            stars += "*";
        }
        return stars;
    }
}
