package day38_methods;

public class ArraysAsParameter {

    public static void main(String[] args) {
        printArray(1,2,3,45);
        printArray("james", "Bond");

    }

    public static void printArray(int ... arr){
        for(int each : arr){
            System.out.println(each);
        }
    }
    public static void printArray(String ... arr){
        for(String each : arr){
            System.out.println(each);
        }
    }



}

