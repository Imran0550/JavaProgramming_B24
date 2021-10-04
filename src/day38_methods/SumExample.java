package day38_methods;

public class SumExample {

    public static void main(String[] args) {
        System.out.println(sum(1, 1999));
        System.out.println(sum(1.5, 2.99));

        String s = "java";
        s.substring(0,1);
        s.substring(1);
    }

    public static int sum(int a , int b){
        return a + b;
    }

    public static double sum(double a, double b){
        return a +
                b;
    }


}
