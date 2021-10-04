package day09_scanner_logical;

public class ShortCircuitPractice {

    public static void main(String[] args) {



        System.out.println(true && false);
        System.out.println(true && 6 >= 5);

        System.out.println(false || true);
        System.out.println(5 == 10 || false);

        int sum = 10;
        System.out.println(sum++ > 10 || ++sum == 10);

        int count = 100;

        System.out.println(++count > 100 && ++count == 100);
        System.out.println(count);

    }
}
