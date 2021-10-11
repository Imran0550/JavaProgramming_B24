package MyPractices;

import java.util.Arrays;

public class FindMax {

    public static int arr (int [] a ){

        int max = a[0];

        for(int each : a){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        System.out.println(arr(a));
    }


}
