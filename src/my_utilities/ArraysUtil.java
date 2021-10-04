package my_utilities;

public class ArraysUtil {

    /*
    This method will accept an int array and return the min number from thr array

     */
    public static void main(String[] args) {
     int [] a = {1,21,2,44,5};
        System.out.println(minNumber(a));
        System.out.println(maxNumber(a));
        System.out.println(contains(a,5));

    }

    public static int minNumber (int [] arr){

        int min = arr[0];

        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
    public static int maxNumber (int [] arr2){
        int max = arr2[0];

        for(int each : arr2){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    public static boolean contains(int [] arr, int num){

        for(int each : arr){
            if(each == num){
                return true;
            }
        }

        return false;
    }

    public static int sum(int [] arr){

        int sum = 0;

        for(int i =0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int [] addElement(int [] arr, int element){


        int [] newArr = new int [arr.length + 1];

        for (int i =0; i < arr.length; i++ ){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = element;
        return newArr;


    }
    /*
    {1,2,3},{4,5}
    [0,0,0,0,0,0]
     */
    public static int [] addElement(int [] arr, int [] elementsToAdd){
        int [] newArr = new int [arr.length + elementsToAdd.length];
        int index = 0;

        for(int each : arr){
            newArr[index++] = each;

        }
        for(int each :elementsToAdd){
            newArr[index++] = each;
        }
return newArr;
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

    public static int indexOf(int [] arr, int num){

        for(int i =0; i < arr.length; i++){
            if(arr[i] == num ){
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(String [] arr, String element){

        for(int i =0; i < arr.length; i++){
            if(arr[i].equals(element )){
                return i;
            }
        }
        return -1;
    }




}
