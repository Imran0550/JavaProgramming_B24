package MyPractices;

public class FindMin {

    public static int min(int [] arr){

        int min = arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr={1,2,4};
        System.out.println(min(arr));
    }
}
