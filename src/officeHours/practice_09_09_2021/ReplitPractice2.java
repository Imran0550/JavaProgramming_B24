package officeHours.practice_09_09_2021;

import java.util.ArrayList;
import java.util.Scanner;

public class ReplitPractice2 {

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums){

        ArrayList<Integer> sum = new ArrayList<>();

        for(Integer each : nums){

            if(each > 0){
                sum.add(each);
            }
        }
        return sum;
    }







    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
}
