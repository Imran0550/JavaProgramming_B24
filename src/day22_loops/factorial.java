package day22_loops;

public class factorial {
    public static void main(String[] args) {

        int number = 5;
        int total = 1;

        while(number > 1){
            System.out.println(total +" * " + number + " ");
            total *= number; // total = total * number
            number--;
        }

        System.out.println(total);
    }
}
