package day48_static;

public class BestBuyStore {

    public static void main(String[] args) {

        BestBuy storeOne = new BestBuy("Main st");
        BestBuy storeTwo = new BestBuy("Oak drive");

        System.out.println(storeOne.location);
        System.out.println(storeOne.location);


       // System.out.println(BestBuy.location);

        System.out.println(BestBuy.day);
        System.out.println(storeOne.day);
        System.out.println(storeTwo.day);
        System.out.println(BestBuy.headquarters);


        BestBuy.day = "Sunday";

        System.out.println(BestBuy.day);
        System.out.println(storeOne.day);
        System.out.println(storeTwo.day);




    }
}
