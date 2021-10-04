package officeHours.practice_09_09_2021;

public class GoogleResult {
    public static void main(String[] args) {
        /*
        About 9,740,000,000 results (1.06 seconds)
         */
        String s = "About 9,740,000,000 results (1.06 seconds)";

        int startOfResult = s .indexOf(" ") + 1;
        int endOfResult = s.indexOf(" result");
        int startOfSeconds = s.indexOf("(");
        int endOfSeconds = s.indexOf( "seconds");

        System.out.println(s.substring(startOfResult , endOfResult));

        System.out.println(s.substring(startOfSeconds + 1 , endOfSeconds));
    }
}
