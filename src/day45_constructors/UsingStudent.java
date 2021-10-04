package day45_constructors;

public class UsingStudent {

    public static void main(String[] args) {

        Student students = new Student();

        students.name = "James";
        students.batchNumber = 24;
        students.grade = 90;

        System.out.println(students);
    }
}
