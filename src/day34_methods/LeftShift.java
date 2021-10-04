package day34_methods;

import java.util.Arrays;
import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int [] num = new int[size];
        for( int i = 0; i < size; i++){
            num[i] = input.nextInt();
        }

        // 2,6,7,8

        // 6,7,8,2 => shift it like this

        int [] shifted = new  int[size];
        for(int i = 0; i < size-1; i++ ){
            shifted[i] = num[i + 1];
        }
        shifted[size-1] = num[0];
        System.out.println(Arrays.toString(shifted));


    }
}
