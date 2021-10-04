package officeHours.practice_09_08_2021;

import java.util.Arrays;

public class WebsiteChecker {

    /*
    for each loop: always goes from the first element to the last one, no indexes involved.

    Website checker
Given some urls determine how many .com, .org, and .edu websites there are. Also keep track of an ‘other’ category for websites that have a different domain
Sample websites for an array:
bing.com, wikimedia.org, twitter.com, amazonaws.com, japanpost.jp, mysql.com, nasa.gov, linkedin.com, ucla.edu, github.io, spotify.com, mozilla.org, nba.com, comcast.net, tamu.edu, utexas.edu,
     */
    public static void main(String[] args) {


        String[] websites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu",};

        int com = 0, org = 0, edu = 0, other = 0;
        int [] counter = new int [4]; // same thing as above , but in scanner way

        for (String eachSite : websites){
            if(eachSite.endsWith(".com")){
                com++;
                counter[0]++;
            }else if(eachSite.endsWith(".edu")){
                edu++;
                counter[1]++;
            }else if(eachSite.endsWith(".org")){
                org++;
                counter[2]++;
            }else{
                other++;
                counter[3]++;
            }


        }

        System.out.println(Arrays.toString(websites));
        System.out.println(".com: " + com);
        System.out.println("edu: " + edu);
        System.out.println("org: " + org);
        System.out.println("others: " + other);
    }
}
