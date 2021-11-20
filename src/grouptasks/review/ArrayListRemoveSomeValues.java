package grouptasks.review;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveSomeValues {

    public static ArrayList<Integer> list (ArrayList<Integer> list2){


        for(int i=0;i<list2.size();i++){
            if(list2.get(i)>100){
                list2.remove(i);
                i--;
            }
        }
       return list2;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,101,102,103,8,90,80,89));
        System.out.println(list(nums));
    }
}
