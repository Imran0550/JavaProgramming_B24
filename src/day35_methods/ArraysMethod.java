package day35_methods;

public class ArraysMethod {

    public static void main(String[] args) {

        int [] num = {1,2,4,7};
        getFirstElement(num);
        getLastElement(num);
        getMiddleElement(num);

    }

    /*
     make a method that accepts the array. Find and print the first element
     make a method that accepts the array. Find and print the last element
     make a method that accepts the array. Find and print the middle element
     */
    public static void getLastElement(int [] myNums){
        System.out.println(myNums[myNums.length -1 ]);
    }
    public static void getFirstElement(int [] myNums){
        System.out.println(myNums[myNums[0]]);
    }
    public static void getMiddleElement(int []myNums){

        if(myNums.length %2 == 1){
            // odd length
            System.out.println(myNums[myNums.length / 2]);
        }else{
            // even length 012345 6/2 -> 3
            System.out.println(myNums[myNums.length /2 -1]);
            System.out.println(myNums[myNums.length/2]);

        }
    }

}
