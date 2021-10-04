package day38_methods;

public class CountElements {

    /*
    Create a method that accepts an int and a number

    count and return the number of items given numbers is found in the array

    return : int
    method name: frequencyOfElement
    parameters: int [], int


     */
    public static void main(String[] args) {
        int [] a = {1,2,3,1,4,1,5,6,5};
        System.out.println(frequencyOfElements(a, 1));
        System.out.println(frequencyOfElements(a, 3));
        System.out.println(frequencyOfElements(a,5));

        getUniqueElements(a);
    }

    public static int frequencyOfElements(int [] arr, int num){

        int count = 0;
        for(int each : arr){

            if(each == num){
                count++;
            }
        }
        return count;
    }
    /*
    Given an int array, find and print all of the unique elements
     */

    public static void getUniqueElements(int [] nums){

        for(int each : nums){

            int counter = frequencyOfElements(nums, each);

            if(counter ==1){
                System.out.println(each);
            }

        }


    }
}
