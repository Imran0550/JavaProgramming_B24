package day42_arraylist;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    /*

    ArrayList of caffeinated drinks

    Figure out how much caffeine each drink has, and store that into a new ArrayList

    coffee - 100
    tea - 50
    monster - 100
    red bull - 100
    coke - 70
    pepsi - 100
    bang- 100
    apple juice - 0

     */
    public static void main(String[] args) {

       String [] allDrinks = {"coffee", "tea", "monster", "red bull", "coke", "pepsi", "bang", "apple juice"};

       ArrayList<String> drinkList = new ArrayList<>(Arrays.asList(allDrinks)); // we converted the Array to ArrayList to make an ArrayList with values right away

       ArrayList<Integer> caffeineAmount = new ArrayList<>();

       // the for each loop goes through every drink element and puts the caffeine amount

       for(String eachDrink : drinkList){

           int caffeineNum =0 ;
           switch (eachDrink){
               case "apple juice":
                   caffeineNum= 0;
                   break;
               case "coffee":
                   caffeineNum = 80;
                   break;
               case "tea":
                   caffeineNum = 50;
                   break;
               case "monster":
               case "red bull":
               case "bang":
                   caffeineNum = 100;
                   break;
               case "coke":
               case "pepsi":
                   caffeineNum = 70;









           }
           caffeineAmount.add(caffeineNum); // acyual adding of the caffeine number to the ArrayList
       }
        System.out.println(drinkList);
        System.out.println(caffeineAmount);

        // printing the drinks and caffeine amount together

        System.out.println("========== Caffeine Table===========");

        for(int i =0; i < drinkList.size(); i++){

            System.out.println("Drink: " + drinkList.get(i));
            System.out.println("Caffeine amount: "+ caffeineAmount.get(i));
            System.out.println();
        }
        System.out.println("========== Finished ===============");
    }



}
