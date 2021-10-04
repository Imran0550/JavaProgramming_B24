package day45_constructors;

import java.util.Arrays;

public class Company {
    public static void main(String[] args) {

        Employee employee = new Employee("Hit man", 45890, "Agent", 200_000_00.0);

        System.out.println(employee);

        employee.goToMeeting();

        Employee [] staff = new Employee[3];
        staff[0] = employee;
        staff[1] = new Employee("Nadir", 10 ,"SDET", 300_000);
        System.out.println(Arrays.toString(staff));

    }
}
