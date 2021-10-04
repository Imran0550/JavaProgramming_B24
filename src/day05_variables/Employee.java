package day05_variables;

import java.sql.SQLOutput;

public class Employee {

    public static void main(String[] args) {

        String firstName = "Imran";
        String lastName = "Nazari";
        String companyName = "Zwak";
        double salary = 20000;
        int startMonth = 8;
        int startDay = 2;
        int startYear = 2021;
        boolean areTheyFullTime = true;
        String jobTitle = "Manager";
        String officeAddress = " 301 River Side blvd";
        String city = "Fredericksburg";
        String state = "VA";
        String zipCode = "22401";



        String fullName,  email, Address;
        String fullStartDate;
        double salaryAfterThreeYears;


        fullStartDate = + startMonth + "/" + startDay + "/" + startYear;



        fullName = firstName + " " + lastName;
        System.out.println("Full Name: " +fullName);
        System.out.println( "StartDate: " + fullStartDate);

        email = firstName +  lastName + startDay +"@" + companyName + ".com";
        System.out.println("Email: " + email);

        salaryAfterThreeYears = salary + startMonth * salary;
        System.out.println("Salary after three years: " + salaryAfterThreeYears);

        Address = officeAddress + " " + " " + city +"," + " " +   state + " " + zipCode;
        System.out.println( "Address:" + Address);

















    }
}
