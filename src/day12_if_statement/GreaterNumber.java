package day12_if_statement;

public class GreaterNumber {

    public static void main(String[] args) {
        /*
        Write Java program that will have three numbers and print the greatest number.First number: 4Second number: 8Third number: 1Output:The greatest number from 4, 8, 1 is:  8
         */

        int first = 4;
        int second = 8;
        int third = 1;

        int biggest = 0;

        if(first > second && first > third){
            biggest = first;
        }
        if(second > first && second > third){
            biggest = second;
        }
        if(third > first && third > second){
            biggest = third;
        }

        System.out.println("the biggest number is: " + biggest);
    }
}
