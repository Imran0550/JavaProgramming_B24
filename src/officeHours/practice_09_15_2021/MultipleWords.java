package officeHours.practice_09_15_2021;

import java.util.Arrays;

public class MultipleWords {

    /*
    Multiple Words
Given a String of words that are separate by commas. Find and print any words that have more than one word
Example
Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”
Output: wooden spoons trash can
dish washer

     */
    public static void main(String[] args) {


        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer, home, , mon day";

        String[] arr = str.split(", ");
        System.out.println(Arrays.toString(arr));

        for(String eachWord : arr){
            if (eachWord.contains(" ") && eachWord.contains(" ")) {
                System.out.println(eachWord);
            }

        }


    }
}
