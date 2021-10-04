package day29_array;

import java.util.Arrays;

public class NumberArrays {
    public static void main(String[] args) {

        int [] ages = {10, 14, 21, 80, 50, 70,40, 30, 19};

        System.out.println(ages.length);
        System.out.println("Ages are: " + Arrays.toString(ages));


        // the below lines are the same thing
        System.out.println(ages[7]);
        System.out.println(ages[ages.length -2]);


        double [] num = {10.1, 10.10, 19.99, 9.99};
        System.out.println(num.length);
        System.out.println(Arrays.toString(num));

        System.out.println(num[num.length -3]);
        System.out.println(num[0] + num[3]);

    }
}
