package day46_constructors;

public class MyOffer {
    public static void main(String[] args) {

        Offer first = new Offer("google",100000.0, true );
        System.out.println(first);

        Offer second = new Offer("virginia","Bank of america",155_000, true, 150);
        System.out.println(second);

    }
}
