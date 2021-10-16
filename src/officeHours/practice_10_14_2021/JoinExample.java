package officeHours.practice_10_14_2021;

import java.util.Arrays;

public class JoinExample {

    public static void main(String[] args) {

        String [] s = {"a","b","c","d"};
        System.out.println(String.join("<>",s));
        System.out.println(String.join("-----", s));

        System.out.println(String.join("",s));

       int [] a = {1,2,3,4,5};
       int n =8;

       int length = a.length;

       int [] arr = new int[length + 1];

       for (int i =0;i<length;i++){
           arr[i] = a[i] ;

       }
       arr[length] = n;
        System.out.println(Arrays.toString(arr));
    }
}
