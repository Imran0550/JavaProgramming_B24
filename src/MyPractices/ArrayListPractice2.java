package MyPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

  //  add to array if negative;

    public static ArrayList<Integer> nums (ArrayList<Integer> list){

        ArrayList<Integer> list1 = new ArrayList<>();

        for(int each : list){
            if(each < 0){
                list1.add(each);
            }
        }
        return list1;
    }

    public static ArrayList<Character> s (String str){
   ArrayList<Character> list = new ArrayList<>();

      for(int i=0;i< str.length();i++){
          if(Character.isLetter(str.charAt(i))){
              list.add(str.charAt(i));
          }
      }
       return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1,2,-1,-4,10,-9));

        System.out.println(nums(nums2));

        String s = "hjuaf73874hv";
        System.out.println(s(s));


    }
}
