package day30_array;

import java.util.Arrays;

public class FirstAndLastCountry {
    public static void main(String[] args) {


        String[] countries = {
                "Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Turkey",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines Nation",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        String largest = countries[0];
        String small = countries[0];


        for(int i = 0; i< countries.length; i++) {
            String each = countries[i];

            System.out.println(each);
            System.out.println(each.charAt(0));
            System.out.println(each.charAt(each.length() - 1));

            if(each.length() > largest.length()){
                largest = each;
            }
            if(each.length() < small.length()){
                small = each;
            }

        }
        System.out.println(small + "\n"+ largest);


















    }
}
