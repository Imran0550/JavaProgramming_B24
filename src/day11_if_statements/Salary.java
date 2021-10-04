package day11_if_statements;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");
        int salary = input.nextInt();

        System.out.println("Are you full time");
        boolean fullTime = input.nextBoolean();

        if(fullTime == true){
            System.out.println(salary + 20000);
        }else{
            System.out.println(salary - 5000);
        }
        System.out.println("final salary: " + salary);


    }
}
