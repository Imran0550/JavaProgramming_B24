package day01_MyPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class StringPraciceArray {

    public static ArrayList<Character> list(String str){

        ArrayList<Character> list1 = new ArrayList<>();

        for(int i =0;i<str.length();i++){

            if(Character.isDigit(str.charAt(i))){
                list1.add(str.charAt(i));
            }

        }

return list1;
    }

    public static void main(String[] args) {
        String s = "djfaaf734894";
        System.out.println(list(s));

        int [] ar = {1,2,3,4,5,6};
        int n = 9;
        System.out.println(Arrays.toString(arr(ar,n)));
    }

    public static int [] arr (int [] arr, int a){

       int length = arr.length;

        int [] arr2 = new int[length + 1];

        for(int i=0;i<length;i++){

            arr2[i] = arr[i];
        }
arr2[length] = a;

        return arr2;
    }


}
