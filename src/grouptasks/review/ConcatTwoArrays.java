package grouptasks.review;

import java.util.Arrays;

public class ConcatTwoArrays {

    public static int [] a (int [] a , int [] b){

        int length = a.length + b.length;
        int [] arr = new int[length];
        int pos =0;

       for(int each : a){
           arr[pos] = each;
           pos++;
       }
       for (int each : b){
           arr[pos] = each;
           pos++;
       }
       return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int [] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(a(arr,arr2)));
    }
}
