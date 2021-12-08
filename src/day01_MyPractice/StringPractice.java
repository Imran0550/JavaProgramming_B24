package day01_MyPractice;

public class StringPractice {


    public static int count (String str){

        int count =0;
        String [] arr = str.split(" ");


       if(arr[0].charAt(arr[0].length()-1) == 'z' ||arr[0].charAt(arr[0].length()-1) == 'y' ){
           count++;
       }
       if(arr[1].charAt(arr[1].length()-1) == 'z' ||arr[1].charAt(arr[1].length()-1) == 'y'){
           count++;
       }






return count;

    }

    public static void main(String[] args) {

        String str = "fez dayyyyyyy";

        System.out.println(count(str));


       // reverseUnique(arr);
    }
}
