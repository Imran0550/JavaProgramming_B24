package MyPractices;

import java.util.Arrays;

public class AddToArr {

    public static void addTo(int [] a , int n,int e){

        int length = a.length;
        int [] newArr = new int[length + 2];

        for(int i=0;i<length;i++){
            newArr[i] = a[i];
        }
        newArr[length] = n;
        newArr[length+1] = e;

        System.out.println(Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,67,0};
        addTo(a,6,9);
    }
}
