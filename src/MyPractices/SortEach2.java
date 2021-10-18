package MyPractices;

import java.util.Arrays;

public class SortEach2 {

    public static String sortEach(String s){


        String sub ="";
        String sorted ="";

        for(int i=0;i<s.length();i++){
            char current = s.charAt(i);

            sub += current;
            boolean sort = false;

            if(i != s.length()-1){
                char next = s.charAt(i+1);

                sort =
                        Character.isLetter(current) && !Character.isLetter(next)||
                                Character.isDigit(current) && !Character.isDigit(next);
            }else {
                sort = true;
            }
           if (sort){
               String [] toSort = sub.split("");
               Arrays.sort(toSort);
               sorted += String.join("",toSort);
               sub = "";
           }
        }
        return sorted;

    }

    public static void main(String[] args) {
        System.out.println(sortEach("AAAGF34765JFHHYYF98"));
    }
}
