package MyPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {

    public static int [] a(int [] arr){

        for(int i=0;i<arr.length;i++){

            for (int x =0;x<arr.length;x++){

                if(arr[i] > arr[x]){
                    int temp =arr[i];
                    arr[i] = arr[x];
                    arr[x] = temp;
                }
            }

        }
return arr;
    }

    public static void main(String[] args) {
        int []a = {1,2,5,4,6,9,8,10,12,11};
        System.out.println(Arrays.toString(a(a)));
    }
}
