package day07_unary_operators;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class kgToPound {

    public static void main(String[] args) {
        int kg = 20;
        double pound = kg * 2.20462;

        System.out.println(kg + " kg = to " + pound  + " pounds"  );
        System.out.println(78 / 2);
        System.out.println(39 % 5);
        int i = 8 + 2 + 3 + 5 - 2 -1 - 0 + 1 * 2;
        System.out.println(i);
        int a = 8;
        int b = a--;
        System.out.println(a);
        System.out.println(b);
        
        int o = 1;
        int c = -o-- + o++ / -o-- * a++;
        System.out.println(c);
        System.out.println(o);


    }
}
