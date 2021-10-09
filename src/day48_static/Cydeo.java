package day48_static;

import java.util.Arrays;

public class Cydeo {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("Imran", 29384,14);
        System.out.println(cydeoStudent);

        System.out.println("Batch: " +CydeoStudent.batchNumber);
        System.out.println(Arrays.toString(CydeoStudent.instructors));
        System.out.println("School: " + CydeoStudent.schoolName);
        System.out.println();
        CydeoStudent student = new CydeoStudent("unknown",210002,14);
        System.out.println(student);
        System.out.println("batch: " + CydeoStudent.batchNumber);
        System.out.println();
        System.out.println(cydeoStudent.name + " and "+ student.name + " have the following instructors: " + Arrays.toString(CydeoStudent.instructors));
    }
}
