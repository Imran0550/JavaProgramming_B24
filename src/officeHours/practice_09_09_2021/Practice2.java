package officeHours.practice_09_09_2021;

import java.util.Scanner;

public class Practice2 {

    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // your code here
       boolean isTrue = false;

       if(toBe == true || notToBe == true){
           isTrue = true;

    }else {
           isTrue = false;
       }
       return isTrue;


}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
}
