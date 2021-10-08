package day47_constructors;
import java.util.ArrayList;
import java.util.Scanner;
public class Store {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

       Item itemOne = new Item("Apple",5,1.33);
       itemOne.quantity +=5;
       itemOne.calculatePrice();
        System.out.println(itemOne);


        String keepGoing = "yes";
        ArrayList<Item> list = new ArrayList<>();

        while (keepGoing.equals("yes")){

            System.out.println("What is the item name");
            String name = scan.nextLine();

            System.out.println("What is the quantity");
            int quan = scan.nextInt();

            System.out.println("What is the unit price");
            double unitPrice = scan.nextDouble();


            Item items = new Item(name, quan, unitPrice);
            list.add(items);
            System.out.println("Do you want to keep adding Items");
            scan.nextLine(); // empty enter input

            keepGoing = scan.nextLine();




        }
        System.out.println("\n shopping list");
        System.out.println(list);

    }
}
