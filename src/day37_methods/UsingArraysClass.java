package day37_methods;

import my_utilities.ArraysUtil;

public class UsingArraysClass {
    public static void main(String[] args) {

       int [] a = {4,5,6,87,90,12};

        System.out.println(ArraysUtil.minNumber(a));
        System.out.println(ArraysUtil.maxNumber(a));

        System.out.println(ArraysUtil.contains(a, 5));
        System.out.println(ArraysUtil.contains(a, 51));

        System.out.println(MethodPractice.min(a));
        System.out.println(MethodPractice.max(a));
    }
}
