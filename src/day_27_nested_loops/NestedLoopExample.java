package day_27_nested_loops;

public class NestedLoopExample {

    // print hello world 5 times
    // hello universe 1 time

    public static void main(String[] args) {

        for (int j = 0; j < 3; j+=2){
            for (int i =0; i < 5; i++){
                System.out.println("Hello world | j: " + j + "i:" + i);
            }
            System.out.println("Hello universe\n");
        }

        //for (int i =0; i < 5; i++){
        //    System.out.println("Hello world");
       // }
        //for(int i =0; i < 5; i++){
          //  System.out.println("Hello universe");
       // }

    }
}
