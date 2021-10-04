package day31_arrays;

import java.util.Arrays;

public class SplitExample1 {
    public static void main(String[] args) {

        String s = "monday,tuesday,wednesday";

        // split up a String into a String array

        String [] days = s.split(",");
        System.out.println(Arrays.toString(days));

        // another example

        String s2 = "Jan-Feb-Mar-Apr";

        String [] months = s2.split("-");
        System.out.println(Arrays.toString(months));


    }
}
