package day43_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDays {
    public static void main(String[] args) {

        System.out.println(getDays());
        System.out.println(getDays(7));

        ArrayList<String> days = getDays();

        System.out.println(days.containsAll(Arrays.asList("Monday","Tuesday", "Friday")));
        System.out.println(days.containsAll(Arrays.asList("Monday","April", "Friday")));

        /*



       Create a method that will return an ArrayList with all the days
           Monday, Tuesday, ... Sunday

          Overload the method so it accept the int number - which day of the week they want
          String

          Input: 1
          Output: Monday

         */

    }
    public static ArrayList<String> getDays(){

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));


       return daysInList;
    }

    public static String getDays(int day ){
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        ArrayList<String> daysInList = new ArrayList<>(Arrays.asList(days));

        return daysInList.get(day -1);
    }

}
