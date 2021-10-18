package day49_encapsulation;

public class TestModifier {

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        obj.a = 30;
        obj.b= 40;
       // obj.c = 33; c is private so we cannot access it outside of the class

     paper paper = new paper();

     paper.cut();
     paper.fold();
     // paper.write(); is private and will not be accessed from here, we can accessed from inside the class


    }
}
