package officeHours.practice_09_09_2021;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GradeBookPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many students will u enter");
        int size = input.nextInt();

        String [] newStudent = new String[size];

        double [] score = new double[size];
        char [] grade = new char[size];

        for(int i =0; i < size;i++){
            System.out.println("please enter student " + (i+1));
            newStudent[i] = input.next();
            System.out.println("Please enter " + newStudent[i] + " s score");
            score[i] = input.nextDouble();

            if(score[i] >= 90){
                grade [i]= 'A';
            }else if(score[i] >= 80){
                grade[i] = 'B';
            }else if(score[i] >= 70){
                grade[i] = 'C';
            }else if(score[i] >= 60){
                grade[i] = 'D';
            }else{
                grade[i] = 'F';
            }
        }
        System.out.println(Arrays.toString(newStudent));
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.toString(grade));

       long distance = 1000000;
        System.out.println(distance);

    }
}
