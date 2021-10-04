package day06_arithmetic_operators;

public class classPizza {
    public static void main(String[] args) {

        String pizza = "cheese";
        byte pizzaSlices = 8;
        byte people = 4;

        byte perPerson = (byte) (pizzaSlices / people);
        System.out.println(perPerson);

        System.out.println("we ordered " + pizza + " pizza with " + pizzaSlices + " slices, " + people + " people ate " + perPerson + " slices each ");
    }
}
