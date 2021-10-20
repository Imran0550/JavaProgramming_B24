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


        System.out.println(equal("Nadar","Nadar"));


    }
    public static boolean equal(String str1, String str2){

        if(str1.length() > 3 && str2.length() >3 && str1.charAt(str1.length()-2) == str2.charAt(str2.length()-2)) return true;


        return false;
    }
}
