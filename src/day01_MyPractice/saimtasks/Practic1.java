package day01_MyPractice.saimtasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practic1 {

    public static ArrayList<Integer> list (ArrayList<Integer> arr){
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i =0 ;i<arr.size();i++){
            if(arr.get(i) %2 == 0){
                arrayList.add(arr.get(i));
            }
        }

        return arrayList;
    }

    public static ArrayList<Integer> list1 (ArrayList<Integer> integerArrayList){
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=0;i<integerArrayList.size();i++){
            if(integerArrayList.get(i)%2==1){
                list2.add(integerArrayList.get(i));
            }
        }

        return list2;
    }

    public static String string (String str){

        String [] strings = str.split("");
        String result= "";
       for(String each : strings){

           if(!result.contains(each)){
               result+= each;
           }

       }
        return result;
    }

    public static void unique(String str){

        


    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,3,6,9,0,7,15,12));

        System.out.println(list(list));
        System.out.println(list1(list));

        String str = "AAABBBCCCD";

        System.out.println(string(str));

    }
}
