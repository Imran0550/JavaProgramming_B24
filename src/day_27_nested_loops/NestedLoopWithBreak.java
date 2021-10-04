package day_27_nested_loops;

public class NestedLoopWithBreak {
    public static void main(String[] args) {

         for (int i = 1; i <= 3; i++){
             System.out.println("first");
          //   if(i == 2){ this break the outer loop, so it only has one iteration  that means we only see the first, second, second.
           //      break;
             }

             for(int j = 1; j <= 2; j++){

                     //            if(j == 2){ this breaks the inner loop, so only on iteration of the inner loop is run
                     //                break;
                     //           }

                 System.out.println("second");
             }
         }
    }

