package officeHours.Practice_09_29_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {

    /*
    Four or less
Given an ArrayList of Strings, go through and read only Strings that are 4 characters or less. Take those Strings and put them into a different ArrayList
Ex:
Input:
“apples”, “tree”, “loop, “cat”, “animal”, “shortcut” Output:
[ tree, loop, cat ]
     */
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java","Doogi","man","add","america"));

        System.out.println(getWordLessThenFour(list));

        System.out.println(getWordLessThenFour2(list));

    }

    public static ArrayList<String> getWordLessThenFour(ArrayList<String> list){
        ArrayList<String> list2 = new ArrayList<>();

        for(String each : list){
            if(each.length() <=4){
                list2.add(each);
            }
        }
        return list2;
    }

    public static ArrayList<String> getWordLessThenFour2(ArrayList<String> list){

       list.removeIf( str -> str.length() > 4 ); // str is the reference for each element
       return list;
    }
}
