package day33_multidimensional_array;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] num = {1, 55, 100, 200};
        System.out.println(Arrays.binarySearch(num, 55));
        System.out.println(Arrays.binarySearch(num, 200));
        System.out.println(Arrays.binarySearch(num, 300));

        // pos where it should be +1 and always negative
        System.out.println();

        int [] not = {49, 30, 2, 1 , 60, 23}; // needs to be sorted, otherwise it will no give u the right result.
        Arrays.sort(not);

        System.out.println(Arrays.binarySearch(not , 30));

        System.out.println();

        int [] third = {-5, -3, -2, 10, 20};

        int indexOfNeg = Arrays.binarySearch(third , -5);
        System.out.println(indexOfNeg);

    }
}
