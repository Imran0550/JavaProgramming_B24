package day42_arraylist;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {

    public static void main(String[] args) {
        Integer [] arr = {1,2,3};

        Arrays.asList(arr);// this allows us to convert from the array to the arraylist

        // converting the 'arr' array to arraylist
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);

        // creating an array with values right away
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,7,84,3,4,10,33,5));
        System.out.println(list2);
        System.out.println(list.isEmpty());


    }
}
