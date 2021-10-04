package day08_relational_logical_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        System.out.println("5 > 3:" + (5 > 3) );

        System.out.println("5 < 3:" + (5 < 3) );

        int a = 5;
        int b = 4;

        System.out.println("a > b: " +(a >  b));
        System.out.println("a >= b: " +(a >=  b));


        boolean checkAEqualToB = a == b;
        System.out.println("a == b:" + checkAEqualToB);

        boolean checkANotEqualToB = a != b;
        System.out.println("a != b:" + checkANotEqualToB);


       // my own practice


        int d = 10;
        int c = 11;
        boolean checkDEqualToC = d == c;
        System.out.println(checkDEqualToC);

        boolean isDGreaterThanC = d > c;
        System.out.println(isDGreaterThanC);

        boolean isDLessThanC = d < c;
        System.out.println(isDLessThanC);


    }
}
