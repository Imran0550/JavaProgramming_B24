package day01_MyPractice.CodingBat;

public class FirstTaskCB {

    /*

Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
     */

    public static int maxMode (int a, int b){

        int max =0;

        if(b%5 == a%5 && b <a){
            max = b;
        }else if (b%5 == a%5 && b > a) {
           max = a;
        }else if(b > a){
            max = b;
        }else if(b < a){
            max = a;
        }else if(a == b || b ==a){
            max = 0;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxMode(5,10));
    }
}
