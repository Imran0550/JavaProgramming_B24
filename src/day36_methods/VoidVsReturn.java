package day36_methods;

public class VoidVsReturn {

    public static void main(String[] args) {
        helloWorld();
       String bye = sayBye();
        System.out.println(bye);
    }

    // this is void method with no params
    public static void helloWorld(){
        System.out.println("Hello world");
    }

    public static String sayBye(){
        return "bye world";
    }


}
