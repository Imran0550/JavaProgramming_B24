package MyPractices;

import java.util.Scanner;

public class ReplitPractice4 {

    public static String clean (String text , String badWord) {
String result ="";
        return text.replace(badWord, "");


        // the other appraoch

      //  if(text.contains(badWord)){

         //   result += text.replace(badWord, "");
        }

//return result;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }


}
