package day37_methods;

import java.util.Scanner;

public class Practice {


    public static boolean isAnagram(String word1, String word2) {

        boolean isAnagram = false;

        char[] arr1 = word1.toCharArray();

        char[] arr2 = word2.toCharArray();

        // sort them

        if(arr1 == arr2){
            isAnagram = true;
        }

return isAnagram;

    }

    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isAnagram(in.nextLine(), in.nextLine()));
    }
}
