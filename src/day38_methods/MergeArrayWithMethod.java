package day38_methods;

import my_utilities.ArraysUtil;

import java.util.Arrays;

public class MergeArrayWithMethod {

    public static void main(String[] args) {
        int [] a ={4,3,2};
        int [] b ={10,20};

        System.out.println(Arrays.toString(ArraysUtil.addElement(a, 5)));
        System.out.println(Arrays.toString(ArraysUtil.addElement(a, b)));

    }
}
