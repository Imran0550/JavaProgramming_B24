package day09_scanner_logical;

public class ShortCircuit {

    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(false && true);

       // System.out.println( true && 5 / 0 == 0); this a problem

        System.out.println( false && 5 / 0 == 0);
        //System.out.println( false & 5 / 0 == 0); // using the single & will execute both sides while && execute one:)


        System.out.println(true || 5/0 == 0);
       // System.out.println(true | 5/0 ==0); same as mentioned above
        int count = 5;

        System.out.println( count++ == 5 || ++count == 7);

        System.out.println(count);

        System.out.println( count++ == 5 | ++count == 7);
        System.out.println(count);







    }
}
