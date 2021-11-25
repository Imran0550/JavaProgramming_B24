package officeHours.practice_11_24_2021;

import java.rmi.server.ServerCloneException;

public class Examples {

    public static void main(String[] args) throws InterruptedException {

        int minutes = 50;

        if(minutes > 45){
            throw new BirdException(minutes);
        }


        Thread.sleep(4000);
//        String s = "java";
//        s.charAt(100);

        try {
            String s2 = "java";
            s2.charAt(100);
          int [] arr = {1,2,3,4,5,};
            System.out.println(arr[100]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String exception caught");
            System.out.println(e.getMessage());
        }catch (IndexOutOfBoundsException e){
            System.out.println("parent catches");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("!😡");
        }


    }




}
/*

      how to prevent the override method in java
      adding final to method means the implementation cannot be changed


      Is it possible to overload main method?
      yes, but you should not
      if you do, it is not the main we use to execute code

      Can main method be overridden





      Checked Exceptions: child of Exception class

           must be handled  during compiling, before the program can run

      Unchecked Exceptions: child of RunTimeException

           does not need to be handled during compiling, but can be normally occur during exception, and usually because of logical or technical issue

           How do you handle exceptions?

           try catch block

          -> throws will allow you to compile and accepts that if an Exception happen



 */