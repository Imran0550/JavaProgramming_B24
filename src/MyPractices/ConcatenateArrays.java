package MyPractices;

import java.util.Arrays;

public class ConcatenateArrays {

    public static int  [] arr(int [] a , int [] b){

        int length = a.length + b.length;

        int [] result = new int[length] ;

        int pos =0;

        for(int each : a){
            result[pos] = each;
            pos++;
        }
        for(int each : b){
            result[pos] += each;
            pos++;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] a ={1,2,3};
        int [] b = {4,5,6};
        System.out.println(Arrays.toString(arr(a,b)));
    }
}
