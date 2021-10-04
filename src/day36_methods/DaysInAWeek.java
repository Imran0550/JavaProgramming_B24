package day36_methods;

public class DaysInAWeek {
    /*
    make a method that will accept a number

    I want to see which day of week it is

    1 - monday
    2 - tue

    6- sat
    7 - sun
     */
    public static void main(String[] args) {

        System.out.println(getDayOfWeek(6));

       String day = getDayOfWeek(2);
        System.out.println(day.charAt(0));

        String day2 = getDayOfWeek(2);
        System.out.println(day2.equals("NOT A VALID DAY"));

        String day3 = getDayOfWeek(7);
        System.out.println(day3);
        if(day3.equals("Saturday") || day3.equals("Sunday")){
            System.out.println("It's Weekend");


        }

    }





    public static String  getDayOfWeek(int n){
        String day = " ";
        switch (n){
            case 1 :
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7 :
                day = "Sunday";
                break;
            default:
                day = "NOT A VALID DAY";

        }
        return day;
    }
}
