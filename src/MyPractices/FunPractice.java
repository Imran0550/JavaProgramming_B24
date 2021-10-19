package MyPractices;

public class FunPractice {

    public static void wearMask(){
        System.out.println("Please wear a mask");
    }
    public static void please6FeetApart(){
        System.out.println("Please keep your distance");
    }
    public static void drinkWater(){

    }
    public static void getVaccinated(){
        System.out.println("Please take your shot");
    }

    public static void main(String[] args) {

        boolean isAlive = true;

        while (isAlive){

            wearMask();
            please6FeetApart();
            drinkWater();
            getVaccinated();

        }

    }
}
