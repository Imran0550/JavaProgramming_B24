package MyPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatentaeArray2 {


    public static int []arr (int[] a, int [] b){

        int length = a.length + b.length;

        int [] newArr = new int[length];
        int pos =0;

        for(int each : a){
            newArr[pos] = each;
            pos++;
        }
       for(int each : b){
           newArr[pos] += each;
           pos++;
       }
       return newArr;

    }

    public static void main(String[] args) {
        int [] a ={1,3,4,2};
        int [] b ={3,4,5,7};
        System.out.println(Arrays.toString(arr(a,b)));
    }
}
