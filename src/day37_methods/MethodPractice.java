package day37_methods;

public class MethodPractice {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 45, 56, 7};

        System.out.println(max(a));
        System.out.println(min(a));
    }

    public static int min(int [] arr){

        int min = arr[0];

      for(int each : arr){
           if (each < min) {
               min = each;
           }
           }
      return min;
       }

       public static int max(int [] arr2){
        int max = arr2[0];

        for(int i = 0; i < arr2.length; i++){
            if(arr2[i] > max){
                max = arr2[i];
            }
        }
        return max;
       }


    }

