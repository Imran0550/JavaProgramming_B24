package officeHours.practice_09_16_2021;

public class FirstAndLast {

    /*
    Given a string array

    first letter and last letter of each element

     */

    public static void main(String[] args) {

        String [] arr = {"apple", "tree", "shed", "maker", "pen"};

        for(String each : arr){

            System.out.println("first character: " + each.charAt(0));
            System.out.println("last character: "+ each.substring(each.length()-1));
            System.out.println(each.substring(0,1));
            System.out.println(each.substring(each.length()-1));




        }


    }
}
