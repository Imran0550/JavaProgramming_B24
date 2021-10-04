package day33_multidimensional_array;

import java.util.Arrays;

public class MultidimensionalArray1 {
    public static void main(String[] args) {

        int [] a = {1, 2, 3}; // single dimensional
        int [] b = {4, 5, 6}; // single dimensional

        int [][] all = { a, b}; // 2d array

        System.out.println(Arrays.toString(all[0]));
        System.out.println(Arrays.toString(all[1]));
        System.out.println(all.length);

        System.out.println(Arrays.deepToString(all)); // prints the whole 2d array



    }
}
