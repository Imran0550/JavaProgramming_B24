package day32_array;

import java.util.Arrays;

public class AWS {

    public static void main(String[] args) {

        String app = "etsy";
        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";

        // you could also do:
        // String [] allZones = zones.split(",");

     for( String each : zones.split(",")){

         System.out.println("Deploying " + app + " to " + each);
     }
    }
}
