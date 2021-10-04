package day05_variables;

public class Movie {
    public static void main(String[] args) {

        String name = "Hitman 3";
        String genre = "Stealth";
        double duration = 1_20_28;
        String releaseDate = "2/29/2001";
        char rating = 'A';
        String rottenTomatoRatting = "95 out 100";

        boolean isOnDvd = false;

        System.out.println("------------Welcome to the Cinema--------------");

        System.out.println("Tonight we are streaming " + name + " which was released on " + releaseDate);
        System.out.println("This " + genre + " movie got a " + rottenTomatoRatting + " rating on Rotten Tomatoes");

    }
}
