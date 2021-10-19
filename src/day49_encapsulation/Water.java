package day49_encapsulation;



public class Water {
    public static void main(String[] args) {


        WaterBottle waterBottle = new WaterBottle("nesle", 20.3);
        System.out.println(waterBottle);

        System.out.println( waterBottle.getBrand());
       waterBottle.setBrand("kikrland");
        System.out.println(waterBottle.getBrand());
    }

}
