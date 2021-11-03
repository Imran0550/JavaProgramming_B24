package day01_MyPractice;

public class FirstAndLast {

    public static boolean firstAndL (String str) {

        // edeited = true;
        boolean result = false;

        if(!str.isEmpty() && str.length()>1) {


            String firstTwo = str.charAt(0) + "" + str.charAt(1);
            String lastTwo = str.charAt(str.length() - 2) + "" + str.charAt(str.length() - 1);

            if(firstTwo.equals(lastTwo)){
                return true;
        }
        }else {
            return false;
        }

     return result;

    }

    public static void main(String[] args) {
        System.out.println(firstAndL("edited"));
    }
}
