package day39_wrapper_arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class ReplitPractice {

    public static boolean isAnagram(String word1, String word2) {

        char [] arr = word1.trim().toLowerCase().toCharArray();
        char [] arr2 = word2.trim().toLowerCase().toCharArray();

        int i1 = arr.length;
        int i2 = arr2.length;

        if(i1 != i2)
            return false;

        Arrays.sort(arr);
        Arrays.sort(arr2);

        for(int i =0; i< i1; i++)
            if(arr[i] != arr2[i])
                return false;

            return  true;

    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
}
