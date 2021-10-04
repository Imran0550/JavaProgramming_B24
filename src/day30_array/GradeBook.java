package day30_array;

import java.util.Arrays;

public class GradeBook {
    public static void main(String[] args) {

        /*

            Student array -> names of students
            grade values (double) - > grade of students

         */
        String [] studentNames = {"James Bond", "Jamie Fox", "Luke Smith"};
        double [] studentGrades = {90, 80.5, 100};

        for(int i =0; i < studentGrades.length; i++){

            System.out.println(studentNames [i] + " -> " + studentGrades[i]);

        }
    }
}
