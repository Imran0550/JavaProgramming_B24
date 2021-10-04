package day21_loops;

public class Numbers {

    /*
    go from 1 - 100 and print only even number
     */
    public static void main(String[] args) {

        int number = 0;
        while(number++  <= 100){
            if(number % 2 ==0){
                System.out.print(number  + " ");
            }
        }

        // print 1 -100 only odd numbers
        System.out.println();

        int number2 = 0;
        while (number2++ <=100){
            if(number2%2 == 1){
                System.out.print(number2 + " ");
            }
        }

    }



}
