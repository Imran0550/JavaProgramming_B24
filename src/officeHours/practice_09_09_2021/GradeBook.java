package officeHours.practice_09_09_2021;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // Figure out how many students and score will enter

        System.out.println("How many students will you enter");
        int size = scan.nextInt();



        // make student array and score array
        String [] students = new String[size];

        double [] scores = new double[size];
        char [] grade = new char[size];


        // make another array for the letter grade and calculate for each one

        // ask the user to enter the student and scores. Fill up array
        for(int i =0; i < size; i++){

            System.out.println("Please enter student: " + (i  + 1));
           students[i] = scan.next();

            System.out.println("Please enter " + students[i] + " " + "'s score");
            scores[i] = scan.nextDouble();

            if(scores[i] >= 90){
                grade[i] = 'A';
            }else if(scores[i] >= 80){
                grade[i] = 'B';
            }else if(scores[i] >= 70){
                grade[i] = 'C';
            }else if(scores[i] >= 60){
                grade[i] = 'D';
            }else {
                grade[i] = 'F';
            }
        }
        System.out.println(Arrays.toString(students));
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(grade));









    }
}
