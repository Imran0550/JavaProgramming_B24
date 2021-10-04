package day11_if_statements;

public class CheckNumbers {

    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 40;

        if(num1 > num2){
            System.out.println(num1 + "is bigger");
        } else {
            System.out.println(num2 + " is bigger");
        }

        int year = 2021;
        if (year == 2020 || year == 2021){
            System.out.println("in lock down");
            System.out.println("stay at home");
        }

        char letter = 't';
        if (letter == 'E' || letter == 'e'){
            System.out.println("letter is e");
        } else{
            System.out.println( letter + " is not e ");
        }

    }
}
