package day20_string;

public class PracticeWords {
    public static void main(String[] args) {

        String s = "java is hard";

       int count =0;

       for(int i =0; i < s.length();i++){

           if(s.charAt(i) == ' '){
               count++;

           }
       }
        System.out.println(count);
        System.out.println();

        String s2 = "Word is good place";
        String reverse ="";
        // reverse this word.

        for(int i = s2.length()-1; i>=0; i--){
            reverse += s2.charAt(i);

        }
        System.out.println(reverse);

    }
}
