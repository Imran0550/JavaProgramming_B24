package day01_MyPractice.replit;

import day53_inheritance.rules.C;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Polindrome {

    public static boolean isPolindrome(String str){
        String reverse = "";
        boolean isPalindrome = false;

        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }

        if(reverse.equals(str)){
            isPalindrome = true;
        }


        return isPalindrome;
    }

    public static String reverseWord (String str){
        // str ==> banana is good
        String reverse = "";
        String result ="";

        String [] arr = str.split(" ");

        for(int i=arr[2].length()-1;i>=0;i--){

            reverse += arr[2].charAt(i);

        }

        return result += reverse + " " + arr[0] + " " + arr[1];





    }
    public static int max (int []arr){

        int max = arr[0];

        for(int each : arr){
            if(each > max){
                max = each;
            }

        }

        return max;
    }

    public static int secMax(int [] arr){

        Arrays.sort(arr);


        return arr[arr.length-2];

    }

    public static String str (String dup){
        String result = "";

        String [] arr = dup.split("");

        for(String each : arr){

            if(!result.contains(each)){

                result += each;
            }

        }
        return result;

    }

    public static String countAndWords(String words){

        String [] arr = words.split("");
        String result = "";

        for(String each : arr){

            int count = 0;

            for(String each2 : arr){

                if(each2.equals(each)){
                    count++;
                }

            }

            if(!result.contains(each)){
                result += each + count;
            }

        }

        return result;
    }

    public static Map<Character, Integer> count (String str){

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch ) +1 );
            }else {
                map.put(ch,1);
            }
        }
return map;
    }

    public static void main(String[] args) {

        System.out.println(isPolindrome("mom"));
        System.out.println(reverseWord("java is fun"));

        int [] arr = {1,2,3,5,10,12};

        System.out.println(max(arr));

        int [] arr2 = {1,2,3,10,30,56};

        System.out.println(secMax(arr2));

        System.out.println(str("AABBDEEFGC"));
        System.out.println(countAndWords("AABBDEEFGC"));


        System.out.println(count("AABBDEEFGC"));

    }
}
