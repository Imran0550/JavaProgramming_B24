package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StoreInventory {
    public static void main(String[] args) {

        /*
        InventoryGiven the following table make three separate arrays to hold the values of the items (String), the prices (double), and the item ids (int)Go to next page for task details Items Prices Item Ids Shoes 89.99 12345 Jackets 150.0 12346 Gloves 9.99 12347 Airpods 250.0 12348 Ipad 439.5 12349 Backpack 39.99 12350
         */



        String [] items = {"Shoes","Jackets","Gloves","AirPod","Ipod","Backpack"};
        int    [] itemIds={12345,12346,12347,12348,12349,12350};
        double [] prices ={89.99,150.0,9.99,250.0,439.5,39.99};

        // find out if the store has jackets.

        boolean hasJackets = false;

        for( String eachItem : items){
            if(eachItem.equals("Jackets")){
                hasJackets = true;
                break;
            }
        }
        if(hasJackets){
            System.out.println("Yes we have jackets, Do you want some?");
        }else{
            System.out.println("No sorry, we don't have jackets");
        }
        // item id  | name of the item | price
        for(int i =0 ; i <items.length; i++){
            System.out.println(itemIds[i] + " | " + items[i] + " | " +  "$" +prices [i] );

        }
        // find the most expensive item.
        double maxPrice = prices[0];
        int indexOfMax = 0;

        for(int i = 0; i <prices.length; i++){

            if (prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println("The most expensive item:");
        System.out.println("item id:" + itemIds[indexOfMax]);
        System.out.println("Name: " + items[indexOfMax]);
        System.out.println("price: "+ prices[indexOfMax]);

















    }
}
