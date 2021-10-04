package day07_unary_operators;

public class IncrementAndDecrement {

    public static void main(String[] args) {
        int n = 0;
        n++;
        System.out.println(n);// 1
        System.out.println(++n);// 2

        System.out.println(n++); // prints 2
        System.out.println(n++);
        System.out.println(n); // prints 3


        int i = 100;
        ++i;
        System.out.println(i);
        System.out.println(++i);

        System.out.println(i++);
        System.out.println(i);






        int m = 100;
        m++;

        System.out.println(m);
        System.out.println(m++);
        System.out.println(m);
        System.out.println(m);

        int d = 100;
        ++d;
        System.out.println(d);
        System.out.println(d++);
        System.out.println(++d);
        System.out.println();
        System.out.println();

        int age = 19;
        System.out.println(age);
        System.out.println(age++);
        System.out.println(age);
        System.out.println(++age);


    }
}
