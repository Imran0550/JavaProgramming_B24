package interviewtasks;

import java.util.Arrays;

public class concatTwoArrays {

    public static int [] arr (int [] a , int [] b){

        int length = a.length + b.length;

        int [] newArr = new int[length];
        int pos =0;

       for (int each : a){
           newArr[pos] = each;
           pos++;
       }


        for(int each : b){
            newArr[pos] = each;
            pos++;
        }

        return newArr;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {4,3,2,1};
        System.out.println(Arrays.toString(arr(a,b)));
    }
}
