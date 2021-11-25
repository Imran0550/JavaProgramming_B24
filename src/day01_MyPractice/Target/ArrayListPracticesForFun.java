package day01_MyPractice.Target;

import java.util.ArrayList;

public class ArrayListPracticesForFun {

    public static ArrayList<Character> chars(String str){

        ArrayList<Character> characters = new ArrayList<>();

        for(int i=0;i<str.length();i++){

            if(Character.isDigit(str.charAt(i))){
                characters.add(str.charAt(i));
            }

        }

        return characters;


    }

    public static void main(String[] args) {

        String str2 = "78kjfiu8u302";

        System.out.println(chars(str2));

    }
}
