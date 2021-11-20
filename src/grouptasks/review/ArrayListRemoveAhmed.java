package grouptasks.review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveAhmed {

    public static ArrayList<String> list(ArrayList<String> str,String str2){

        for(int i=0;i<str.size();i++){
           if(str.get(i).equals(str2)){
                str.remove(i);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Ahmed","Seyar","Khan","Ahmed"));
//        list1.add("Seyar");
//        list1.add("Ahmed");
//        list1.add("Kan");
//        list1.add("Ahmed");

        System.out.println(list(list1,"Ahmed"));
    }
}
