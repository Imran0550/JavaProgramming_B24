package day29_array;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] prices = new double[6];
        System.out.println(Arrays.toString(prices));

        prices[0] = 25.99;
        prices[1] = 26.99;
        prices[2] = 10.99;
        prices[3] = 9.99;
        prices[4] = 8.0;
        prices[5] = 10.99;
        System.out.println(Arrays.toString(prices));

        System.out.println(prices[0] + prices [2]);
        System.out.println(prices[prices.length -1]);

        prices[2] = 200.0;
        System.out.println(Arrays.toString(prices));
        prices = new double[2];
        System.out.println(Arrays.toString(prices));
    }
}
