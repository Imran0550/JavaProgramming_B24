package officeHours.practice_10_14_2021;

import java.util.Arrays;

public class SortEachLetterAndDigit {

    /*
     Input: "DC501GCCCA098911"
     OUTPUT: "CD015ACCCG011899"
     how do we find the substrings

     how do we find the substring

     current char letter ? is next one (i+1) letter? -> good
      current char letter ? is next one (i+1) is NOT letter? -> we found the substring

      action:
         sort this substring
         assign sorted substring to final string
         reset current substring to be empty

         current char digit? is the next one (i+1) digit -> good
         current char digit? is the next one(i+1) is not digit -> we found substring

         when we are on the last letter length -1
         force the action to happen -> assuming the last character is part of the substring

    */

    public static String sortEachPart(String s){

        String sub ="";
        String sorted = "";



        for (int i=0;i<s.length();i++){

            char current = s.charAt(i);
            sub += current;
            boolean sort = false;
            if(i != s.length()-1) {
                char next = s.charAt(i + 1);

                 sort =
                        Character.isLetter(current) && !Character.isLetter(next) ||
                        Character.isDigit(current) && !Character.isDigit(next);
            }else {
                sort = true;
            }
            if(sort){
                String [] toSort = sub.split("");
                Arrays.sort(toSort);
               // Ssorted = Arrays.toString(toSort).replace("[","").replace("]","").replace(", ","");
                sorted += String.join("",toSort);
                sub = "";
            }
        }
       return sorted;
    }

    public static void main(String[] args) {
        System.out.println(sortEachPart("DC501GCCCA098911"));
    }

}
