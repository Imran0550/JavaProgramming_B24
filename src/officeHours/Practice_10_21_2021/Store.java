package officeHours.Practice_10_21_2021;

public class Store {

    public static void main(String[] args) {

        WaterBottle bottle = new WaterBottle("kirkland",16);
        System.out.println(bottle.getOunces());
        bottle.setOunces(17);
        System.out.println(bottle.getOunces());
        System.out.println(bottle.getBrand());
        bottle.setBrand("ice mountain");
        System.out.println(bottle.getBrand());
        bottle.setOunces(-29);
        System.out.println(bottle.getOunces());

        bottle.setBrand(null);
        System.out.println(bottle.getBrand());



    }
}
