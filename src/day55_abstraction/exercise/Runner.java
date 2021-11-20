package day55_abstraction.exercise;

public class Runner {

    public static void main(String[] args) {

        Squatting squatting = new Squatting();

        squatting.getCaloriesBurned(7);
        squatting.perform();
        squatting.rackWeights();
    }
}
