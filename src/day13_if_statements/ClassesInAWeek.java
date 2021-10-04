package day13_if_statements;

public class ClassesInAWeek {
    public static void main(String[] args) {

        /*
        day
        monday, wednesday, thursday, saturday, sunday
        -> java
        tuesday
        -> sof skills
        friday
        -> off
         */
        String day = "sunday";

        boolean isTechincalDay = day.equals("monday") || day.equals("wednesday") || day.equals("thursday") || day.equals("saturday") || day.equals("sunday");

        boolean isSoftskills = day.equals("tuesday");

        boolean isFriday = day.equals("Friday");


        if(isTechincalDay){
            System.out.println("Java");
        }else if (isSoftskills){
            System.out.println("soft skills");
        } else if(isFriday){
            System.out.println("off day");
        } else {
            System.out.println("Invalid input");
        }


    }
}
