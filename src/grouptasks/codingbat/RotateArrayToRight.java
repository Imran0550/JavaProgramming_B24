package grouptasks.codingbat;

import java.util.Arrays;

public class RotateArrayToRight {

    public static int [] arr(int [] a){

        int a2 = 2;

        for(int i = 0;i <a2;i++){

            int j, last;

            //Store the last element of the array
            last = a[a.length-1];

            for (j=a.length-1;j>0;j--){

                //shift elements of array by one
                a[j] = a[j-1];
            }

            //add the last element to the start of the array

            a[0] = last
                    ;


        }

return a;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,6};
        System.out.println(Arrays.toString(arr(arr)));
    }

}
