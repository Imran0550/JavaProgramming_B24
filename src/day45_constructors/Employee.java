package day45_constructors;


import java.util.Locale;

public class Employee {

    String name;
    int id;
    String jobTitle;
    double salary;


    public Employee(String str, int  ids, String str2, double slr){

       name = str;
       id = ids;
       jobTitle = str2;
       salary = slr;


    }

    public void goToMeeting(){

        System.out.println(name + " is going to the meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: '" + name + '\'' +
                ", id: " + id +
                ", jobTitle: ' " + jobTitle + '\'' +
                ", salary: " + salary +
                '}';



    }

}

