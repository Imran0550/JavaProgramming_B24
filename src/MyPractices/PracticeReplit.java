package MyPractices;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeReplit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }

    public static ArrayList<Integer> appendPosSum (ArrayList<Integer> list){

        ArrayList<Integer> list1 = new ArrayList<>();

       int sum =0;

       for(int eachNum : list){
           if(eachNum > 0){

               list1.add(eachNum);
               sum+= eachNum;
           }


        }
       list1.add(sum);

       return list1;

    }
}
