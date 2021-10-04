package day07_unary_operators;

public class Store {
    public static void main(String[] args) {

        String storeName = "target";
        int numberOfTvs = 100;

        System.out.println("person came into the store bought a tv");
        System.out.println("Number of tvs now: " + --numberOfTvs );

        System.out.println("person came into the store bought a tv");
        System.out.println("Number of tvs now: " + --numberOfTvs );

        System.out.println("person came into the store and a putt atv into the cart");
        System.out.println("number of tvs in the store is still: " + numberOfTvs--);
        System.out.println("they buy everything and leave:" + numberOfTvs);

        System.out.println("Shipment of tvs comes");
       // numberOfTvs++
        // 47 more lines
        numberOfTvs = numberOfTvs + 53; // here we reassigned

        System.out.println("someone with big bucks comes in and bus 5 tvs");
        numberOfTvs = numberOfTvs - 5;

       // numberOfTvs++ <- same -> numberOfTvs = numberOfTvs + 1

    }
}
