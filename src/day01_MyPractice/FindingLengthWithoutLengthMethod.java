package day01_MyPractice;

import java.util.Arrays;

public class FindingLengthWithoutLengthMethod {

    public static void main(String[] args) {
        String str = "hello";
        char [] arr = str.toCharArray();
        int count = 0;
        for(char each : arr){
            count++;
        }

        System.out.println(count);
    }
}
