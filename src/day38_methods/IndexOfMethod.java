package day38_methods;

public class IndexOfMethod {

    /*
    Create a method that will accept an array and an element
    return the index of the first occurrence of the element

    if the element does not exist in our array, we'll return -1

    start with int array

    after: overload to work with String array

     */
    public static void main(String[] args) {

        int [] a = {1,2,4,67,8,7};
        System.out.println(indexOf(a, 2));
        String [] b = {"a","b","c"};
        System.out.println(indexOF(b, "a"));

    }



    public static int indexOf(int [] arr, int num){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static int indexOF(String []arr , String num){
        for(int i =0; i < arr.length; i ++){
            if(arr[i].equals(num)){
                return i;
            }
        }

        return -1;
    }
}

