package day01_MyPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static ArrayList<Character> list(String str){
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<str.length();i++){

            if(Character.isDigit(str.charAt(i))){
                list.add(str.charAt(i));
            }
        }
        return list;
    }


    public static void main(String[] args) {
        String s = "7928radhfu";

        System.out.println(list(s));
    }
}
