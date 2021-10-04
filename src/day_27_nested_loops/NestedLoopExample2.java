package day_27_nested_loops;

public class NestedLoopExample2 {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){
            System.out.println("A");

            for(int j = 0; j < i; j++){
                System.out.println("B");
            }
            System.out.println();
        }

        /*
        i = 0
            A
        j = 0
            0 < 0 -> false
        i = 1
            A
        j = 0
            0 > 1 -> true -> 1B

        i = 2
        j = 2
         */
    }
}
