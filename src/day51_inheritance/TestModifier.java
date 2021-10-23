package day51_inheritance;

public class TestModifier {


    public static void main(String[] args) {

        Modifier modifier = new Modifier();

        System.out.println(modifier.A);
        System.out.println(modifier.B);
        System.out.println(modifier.C);
       // System.out.println(modifier.D); cannot be accessed because it's private.
    }
}
