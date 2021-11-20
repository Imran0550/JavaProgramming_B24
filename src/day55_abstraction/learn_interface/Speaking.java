package day55_abstraction.learn_interface;

public class Speaking {
    public static void main(String[] args) {


        Spanish spanish = new Spanish();

        spanish.hi();
        spanish.bye();
        System.out.println();
        English english  = new English();
        english.hi();
        english.bye();

    }
}
