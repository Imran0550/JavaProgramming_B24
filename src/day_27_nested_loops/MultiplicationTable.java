package day_27_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i =0; i <= 5; i++){
            System.out.println("Multiplication Table for " + i);

            for(int d =0; d <= 10; d++){
                System.out.println( i + " X " + d + " = " + (i * d));
            }
        }
    }
}
