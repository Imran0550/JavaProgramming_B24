package MyPractices;

import java.util.Scanner;

public class ReplitPractice3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverME) {
        // your code here

        /*
        The coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

to search and find each appearance of coverME within main
then surround it with square brackets [coverMe]
if you cannot find the coverME within main then just return whole main itself covered [main].
keep in mind that coverME value can be of any length.
         */

String result ="";

if(!main.contains(coverME)){

    result += "["+ main+"]";

}else{
    result  = main.replace(coverME , "["+ coverME+"]");
}



return result;
    }
}
