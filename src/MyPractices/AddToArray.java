package MyPractices;

import java.util.Arrays;

public class AddToArray {

    /*
    int [] = {1,4,5,6}
    1 add this to the array
     */

    public static int [] arr (int [] a , int n){

        int length = a.length;

        int [] newArr = new int[length + 1];

        for(int i=0;i<length;i++){
            newArr[i] = a[i];
        }
        newArr[length] = n;

        return newArr;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int n =9;
        System.out.println(Arrays.toString(arr(a,n)));
    }
}
