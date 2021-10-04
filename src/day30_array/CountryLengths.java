package day30_array;

public class CountryLengths {
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
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        // find and print all the first and last characters
        // find the print all the middle characters
        // find the largest and smaller country lengths

        for(int i =0; i < countries.length; i++){

            String each = countries[i];
            int mid = each.length() / 2;

            System.out.println("Country: " + each);
            System.out.println("First letter: " + each.charAt(0));
            System.out.println("Last letter: " + each.charAt(each.length() -1));
            System.out.println(each.substring(mid -1, mid +1));


        }



    }
}
