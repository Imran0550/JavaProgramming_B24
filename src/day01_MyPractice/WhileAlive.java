package day01_MyPractice;

public class WhileAlive {

    public static void main(String[] args) {

        boolean alive = true;

        while (alive){
            eat();
            drink();
            eatPizza();
            codeJava();

            break;
        }

    }
        public static void eat () {
            System.out.println("eat");
        }
        public static void drink () {
            System.out.println("drink");
        }
        public static void eatPizza () {
            System.out.println("eat pizza");
        }
        public static void codeJava () {
            System.out.println("Code java");
        }




}
