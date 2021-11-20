package day01_MyPractice;

public class LateNightPractice {


    public static String str (String hello){

        String [] arr = hello.split("");
        return arr[0];
    }

    public static void main(String[] args) {
        System.out.println(str("Hello World"));
    }
}
