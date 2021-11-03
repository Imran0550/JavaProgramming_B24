package day54_abstraction.hidding;

public class Run {
    public static void main(String[] args) {

        A a = new A();
        a.instanceMethod();
        a.staticMethod();

        B b = new B();
        b.staticMethod();
        b.instanceMethod();
        b.instanceMethod();

    }

}
