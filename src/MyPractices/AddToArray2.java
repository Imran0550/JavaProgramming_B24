package MyPractices;

import java.util.Arrays;

public class AddToArray2 {

    public static int [] a (int [] num , int a){

        int length = num.length;

        int [] a1 = new int[length + 1];

        for(int i=0;i<length;i++){
            a1[i] =num[i];
        }
        a1[length] = a;


        return a1;
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};

        System.out.println(Arrays.toString(a(a, 2)));
    }
}
