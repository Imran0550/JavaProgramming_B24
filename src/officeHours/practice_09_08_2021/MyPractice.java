package officeHours.practice_09_08_2021;

import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code

        String result = "";

        for(int i =0; i <= str.length()-1;i++){

            String curChar = str.substring(i , i+1);

            if(!result.contains(curChar)){
                result += curChar;
            }
        }

return result;
    }
}
