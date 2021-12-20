package day01_MyPractice;

import java.util.*;

public class ListVsSet {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(20);
        list.add(40);
        list.add(40);
        list.add(13);
        System.out.println(list);


           for(int i=0;i<list.size();i++){
               int count =0;
               for(int x=0;x<list.size();x++){

                   if(list.get(x) == list.get(i)){

                   }

               }



           }


        // remove the duplicate from the list above using set
        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }
}
