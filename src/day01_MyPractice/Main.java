package day01_MyPractice;

import java.util.AbstractList;
import java.util.ArrayList;

public class Main {

   ArrayList<pillow> pillows;
   public Main(){
       pillows = new ArrayList<>();
   }
}
class pillow{
    public static void main(String[] args) {
        Main main = new Main();
        main.pillows.add(new pillow());
        main.pillows.add(new pillow());

        System.out.println(main.pillows.size());
    }
}
