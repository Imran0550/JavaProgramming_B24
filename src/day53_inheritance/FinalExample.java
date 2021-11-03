package day53_inheritance;

public final class FinalExample {

    final int a;
   public static final String PLANET = "Earth";


    public FinalExample(int a){
        this.a = a;


    }

    public static void main(String[] args) {
        FinalExample finalExample = new FinalExample(5);

        System.out.println(finalExample.a);
        System.out.println(PLANET);
       // finalExample.a =6; a is final so we cannot change the value
    }
}
