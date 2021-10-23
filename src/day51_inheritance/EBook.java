package day51_inheritance;

import java.util.Arrays;

public class EBook extends Book {


       double size;
       int pages;

       public void read(){
           System.out.println("Reading "+title);
       }


}
// can you have more than one parent?
//No, java does not allow multi-inheritance
