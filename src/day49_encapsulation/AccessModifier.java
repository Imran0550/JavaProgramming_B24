package day49_encapsulation;

public class AccessModifier {

    public int a; // can be accessed from anywhere
    int b;// can only be accessed from same package
    private int c;// only can be accessed inside the class not outside.


    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        obj.a = 30;
        obj.b= 40;
        obj.c = 50;



    }


}
