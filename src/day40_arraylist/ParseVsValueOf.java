package day40_arraylist;

public class ParseVsValueOf {

    public static void main(String[] args) {

        String s = "30";
        System.out.println(s + 5);

        int seconds = Integer.parseInt(s); // converts the "30" String into the int value of 30.

        System.out.println(seconds < 60);

        Integer num = Integer.valueOf(s);// converts the "30" String into the Integer wrapper class object that has a value of 30.
        System.out.println(num < 60);

        // my own practice

        System.out.println();

        String a = "40";
        int s2 = Integer.parseInt(a);
        System.out.println(s2 + 100);

        Integer num2 = Integer.valueOf(a);

        System.out.println(num2);

        String s3 = String.valueOf(seconds); // converts the int second of 30 to the String object
        System.out.println(s3);

        System.out.println(s3.charAt(0));


        // my own practice

        String num3 = "50";
        System.out.println(num3 + 5);// in order to do this operation u need to change String type into int type

        int num5 = Integer.parseInt(num3);
        System.out.println(num5 + 5);

        Integer num0 = Integer.valueOf(num3);
        System.out.println(num0);

    }
}
