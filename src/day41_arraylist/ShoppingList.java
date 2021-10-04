package day41_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        if(list.isEmpty()){
            System.out.println("You should add something to your list");
        }else{
            System.out.println("your list has some things");
        }
        String keepAsking = "";
        do {
            System.out.println("What do you want to your list");
            String item = scan.nextLine();

            list.add(item);

            System.out.println("Do you want to add anything else");
            keepAsking = scan.nextLine();

        }while (keepAsking.equalsIgnoreCase("yes"));

        System.out.println("This is your shopping list: " + list);

        System.out.println("Size after adding items: " + list.size());

        if(list.isEmpty()){
            System.out.println("You should add something to your list");
        }else{
            System.out.println("your list has some things");
        }

        System.out.println("Do you want to remove anything");
        String wantToRemove = scan.nextLine();
        if(wantToRemove.equalsIgnoreCase("yes")){
            System.out.println("What do you want to remove");
            list.remove(scan.nextLine());

        }
        System.out.println("Shopping list after remove: " + list);
        System.out.println("size after remove: " + list.size());




    }
}
