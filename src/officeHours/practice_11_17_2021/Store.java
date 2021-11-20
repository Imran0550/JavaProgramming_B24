package officeHours.practice_11_17_2021;

import day53_inheritance.rules.C;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        // All possible references of a tshirt object

        TShirt tShirt = new TShirt();
        tShirt.wear();
        Clothes shirt = new TShirt();
        shirt.wear();

        Object shirt1 = new TShirt();
        //shirt3.wear(); invalid because objectt class does not have wear method

        buy(tShirt);
        buy(shirt);

        // All possible references of jacket

        Jacket jacket = new Jacket();
        jacket.wear();
        jacket.putOnHood();

    //////////////////////////////////////////////
        Clothes jacket2 = new Jacket();
        jacket2.wear();
        //cast to access the put on hood method
        ((Jacket)jacket2).putOnHood();
        //another way
         Jacket jacket1 = (Jacket) jacket2;
         jacket1.putOnHood();
  ////////////////////////////////////////////////

        HasHood jacket3 = new Jacket();
        ((Jacket)  jacket3).wear();
        jacket3.putOnHood();

        buy(jacket1);
        buy(jacket2);
        buy((Jacket)jacket3);

        ArrayList<Clothes> list = new ArrayList<>();
        list.add((Clothes) shirt1);
        list.add(shirt);
        list.add((Clothes) tShirt);
        list.add(jacket);
        list.add(jacket1);
        list.add(jacket2);
        list.add((Jacket)jacket3);

        for (Clothes each : list){
            each.wear();
        }


    }

    public static void buy(Clothes obj){

    }
}
