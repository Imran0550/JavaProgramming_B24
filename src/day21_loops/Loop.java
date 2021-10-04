package day21_loops;

public class Loop {
    public static void main(String[] args) {


//        System.out.println("Hello world");
  //      System.out.println("Hello world");
  //      System.out.println("Hello world");
   //     System.out.println("Hello world");

  //      while (true){
  //          System.out.println("hello world");
   //     }

        int number = 1;
        while (number <= 100) {
            System.out.println("hello world" + number);
            number ++;
        }
        System.out.println();

        int number2 = 1;
        while (number2 <= 100) {
            System.out.println("hello universe" + ++number2);

            System.out.println();

            int number3 = 1;
            while (number3++ <= 100) {
                System.out.println("hello Galaxy" + number3);

            }
            System.out.println(number3);

        }
    }
}
