package day16_switch;

import java.util.Scanner;

public class PersonalInforrmation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many people you live with");
        int numberOfPeople = input.nextInt();
        if(numberOfPeople < 2){
            System.out.println("Live with less than 2 people");
        }else if(numberOfPeople == 3 || numberOfPeople == 4 || numberOfPeople == 5 || numberOfPeople == 6){
            System.out.println("Live with 3 - 6 people");
        }else if (numberOfPeople > 6){
            System.out.println("Live with more than 6 people ");
        }
        System.out.println("What city you live in");
        String city = input.next();
        System.out.println("Do you live in downtown?");
        String liveInDowntown = input.next();
        if(liveInDowntown.equals("yes")) {

        }else if (liveInDowntown.equals("no")) {
            System.out.println("oh, that is okay");
        }



            System.out.println("Have you thought about moving to the suburbs");
               String moving = input.next();
            if(moving.equals("yes")){
                System.out.println("do it its great");
            } else if (moving.equals("no")){
                System.out.println("You should think about it");
            }
            System.out.println("What is your favorite animal?");
            String favoriteAnimal = input.next();
            if(favoriteAnimal.equals("cat")){
                System.out.println("WOW, cat is a great animal");
            }
            System.out.println("How many pets do you want?");
            int howManyPets = input.nextInt();
            if(howManyPets == 2){
                System.out.println("Interesting, do you want 2 " + favoriteAnimal);
            }

        }
    }
