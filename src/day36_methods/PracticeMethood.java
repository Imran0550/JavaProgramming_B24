package day36_methods;

public class PracticeMethood {

    public static String name (String name){

        if(name.contains("e") || name.contains("i")){
            System.out.println("great name!");
        }else{
            System.out.println("Not bad");
        }

        return name;
    }

    public static void main(String[] args) {
        System.out.println(name("imran khan"));
    }
}
