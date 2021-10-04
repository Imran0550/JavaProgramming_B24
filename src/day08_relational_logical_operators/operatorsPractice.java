package day08_relational_logical_operators;

public class operatorsPractice {
    public static void main(String[] args) {

        /*
        / first priorities will be:  * / %
        /    + -
         */

        int w = 78 /2 * 2 + 3 - 5 % 5;
        //       39 * 2 + 3 - 5 % 5
        //        78 + 3 - 5 % 5 -> 5/5 = 1, but no much
        //        78 + 3 - 0
        //          81

        System.out.println("w: " + w);

        System.out.println();



        int c = 1; // c = -1
        int d = -c-- + c++ / -c-- * --c;
        //       -1 + 0 / -1 * -1
        //        -1 + 0 * -1
        //         -1 + 0

        System.out.println("c: " + c);
        System.out.println("d: " + d);

        System.out.println();


        int t = 100; // t = 100 / 101/ 100 / 101 / 100
        int p = - ++t * - t-- / t++ + --t;
        //     - 101 * - 101 / 100 + 100
        //       10201 / 100 + 100
        //         102 + 100
        //           202

        System.out.println("t: " + t);
        System.out.println("p " + p);
    }
}
