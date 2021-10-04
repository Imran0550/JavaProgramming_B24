package day24_loops;

import java.util.Locale;

public class Reverse {
    public static void main(String[] args) {

       for (int i = 100; i >=0; i--){
           System.out.println(i);
       }
       for(int x = 50; x >= 0; x--){
           System.out.println(x);
       }
       String word = "afghanistan";
       String word2 = "bahrain";
       int countA = 0;
       String reverse = "";

       for(int f = 0; f < word.length(); f ++){
           if(word.charAt(f) == 'a'){
               countA++;
           }



       }
       for(int d = word.length() -1; d >=0; d--){
           reverse += word.charAt(d);
       }
        System.out.println(countA);
        System.out.println(reverse);

        for(int x = word.length(); x <= 20; x++ ){
            System.out.println(word);
        }

        String name = "Humaira";
        int countOfA = 0;
        String reverse3 = "";
        for ( int i = 0; i < name.length(); i++ ){
            if(word.charAt(i) ==  'a'){
                countOfA++;
            }

        }
        for(int i = name.length() -1; i >=0; i--){
            reverse3 += name.charAt(i);
        }
        System.out.println(countOfA);
        System.out.println(reverse3);






    }
}
