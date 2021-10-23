package day51_inheritance;

import java.util.AbstractList;

public class WorkPlace {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Saim";

        Tester tester = new Tester();
        tester.name = "Imran";

        Developer developer = new Developer();
        developer.name = "Khani";

        employee.work();
        tester.work();
        developer.work();



    }
}
