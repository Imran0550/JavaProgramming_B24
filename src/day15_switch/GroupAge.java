package day15_switch;


import java.util.Scanner;

public class GroupAge {
    public static void main(String[] args) {
        /*
     create a class AgeGroup
create a main method

Write a program that can define the age groups of someone based on their given age:

infant (< 1 year)
Toddler (3 - 5)
Kid (6 - 9
Pre-Teen (10 - 12)
Teenager (13 - 17)
Young Adult (18 - 20)
Adult (21 - 35)
Middle-Aged Adult (36 - 55)
Senior Citizen (55+)

Challenge: if age > 120 or less than 0 ==> invalid entry
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");

        int age = input.nextInt();
        String message = " ";

       if(age >= 0 && age <= 120){
           if(age <= 1) {
               message = "infant";

           }else if (age <= 5 ){
               message = "Toddler";

           }else if (age <= 9){
               message = "kid";
           }else if (age <= 12){
               message = "Pre teen";
           }else if (age <= 17){
               message = "Teenager";

           }else if (age <= 20){
               message = "Young Adult";
           }else if (age <= 35){
               message = "Adult";
           }else if (age <= 55){
               message = "Middle Aged Adult";
           } else {
               message = "Senior Citizen";
           }

        } else {
           message = "Invalid Age";
       }


        System.out.println(message);
    }
}

