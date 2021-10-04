package day06_arithmetic_operators;

public class GradeCalculator {
    public static void main(String[] args) {

        double score1 = 40;
        double score2 = 50;
        double score3 = 59;
        double score4 = 50;

        double average = (score1 + score2 + score3 + score4)/ 4;
        double highScore = (score1 + score2 + score3 + score4);

        System.out.println(average);
        System.out.println(highScore);

    }
}
