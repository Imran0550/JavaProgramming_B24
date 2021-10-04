package officeHours.practice_09_08_2021;

import java.util.Scanner;

public class HasJava {


public static void sign(int n){

    if(n > 0){
        System.out.println("positive");

    }else if(n <0){
        System.out.println("negative");
    }else{
        System.out.println("zero");
    }

}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        sign(n);
    }


















}
