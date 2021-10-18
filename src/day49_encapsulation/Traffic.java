package day49_encapsulation;

public class Traffic {
    public static void main(String[] args) {


        TrafficLight trafficLight = new TrafficLight("red");
// cannot access color directly anymore.
        //System.out.println(trafficLight.color);

       // trafficLight.color = "brown";

        System.out.println(trafficLight.getColor());

     trafficLight.setColor("green");
        System.out.println(trafficLight.getColor());

        trafficLight.setColor("brown");
        System.out.println(trafficLight.getColor());
    }
}
