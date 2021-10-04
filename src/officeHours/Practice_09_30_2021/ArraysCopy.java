package officeHours.Practice_09_30_2021;

import java.util.Arrays;

public class ArraysCopy {

    public static void main(String[] args) {

        int [] a = {1,2,3};
        int [] b =a;
        b[0] = 1000;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
