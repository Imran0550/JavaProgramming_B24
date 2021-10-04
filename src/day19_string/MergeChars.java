package day19_string;

import java.util.Locale;

public class MergeChars {
    public static void main(String[] args) {

        /*
        String one: abc
        String two: def

        Merge to get abcdef


         */
        String one = "abc";
        String two = "def";

        String merge = "" + one.charAt(0) + one.charAt(1) + one.charAt(2) + "" + two.charAt(0) + two.charAt(1) + two.charAt(2);
        System.out.println(merge);

        // my own practice
      String merge2 = one +"" + two;
        System.out.println(merge2);
    }
}
