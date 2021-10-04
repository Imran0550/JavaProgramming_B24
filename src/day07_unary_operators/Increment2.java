package day07_unary_operators;

public class Increment2 {

    public static void main(String[] args) {

        int i = 5;
        i++; // i=6
        int x = i++;
        System.out.println("x: " + x); // int x = 6, i becomes 7
        System.out.println("i: " + i);

        int b = 10; // 11
        int c = ++b; // int c =b;

    }
}
