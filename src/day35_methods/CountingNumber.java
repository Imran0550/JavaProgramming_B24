package day35_methods;

public class CountingNumber {

    public static void countingNumber0To5(){





        for(int i = 0; i <=5; i++){
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void countingNumber0ToN(int n){






        for(int i = 0; i <=n; i++){
            System.out.print(i + " ");
        }

        System.out.println();

    }


    /*
        Define a method that will count number from 0 to 5
        print the number in one line
         */

    public static void main(String[] args) {
        countingNumber0To5();

        countingNumber0ToN(10);

        countingNumber0ToN(7);
    }

}
