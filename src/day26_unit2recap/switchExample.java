package day26_unit2recap;

import java.util.Scanner;

public class switchExample {
    public static void main(String[] args) {
        /*
        Mood Ring [Switch]You have a mood ring and need to know what mood you are in based on the color. The color will also provide a max budget value that is suggested for shoppingdata:pink:mood: happybudget: 200blue:mood: relaxedbudget: 150orange:mood: nervousbudget: 50red:mood: angrybudget: 0
         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is mood ring color?");
        String color = input.next()
                            .toLowerCase()
                            .trim();





        String mood = "";
        double budget = 0;

        switch (color) {
            case "pink":
                mood = "happy";
                budget += 200;
                break;
            case "blue":
                mood = "relax";
                budget += 150;
                break;
            case "orange":
                mood = "nervous";
                budget += 50;
                break;
            case "red":
                mood = "angry";
                budget += 0.0;
        }

        System.out.println("mood: " + mood + "\n" + "budget: $" + budget);














    }
}
