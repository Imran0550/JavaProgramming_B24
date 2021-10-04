package day19_string;

import java.util.Arrays;

public class PracticeE {

    // email : imrannazari@cybertek.net
    // first name : 2 char to uppper case
    /*
        last middle to to upper case

        find the domain
     */
    public static void main(String[] args) {


        String s = "imran_nazari@cybertek.net";

        int underS = s.indexOf("_");
        int postOf = s.indexOf("@");
        String firsName = s.substring(0, underS);
        String lastName = s.substring(underS + 1, postOf);
        String domain = s.substring(postOf+ 1);

        String firstN = firsName.substring(0,3).toUpperCase() + firsName.substring(3).toLowerCase();
        String lastN = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("First name: " + firstN);
        System.out.println("Last name: "  + lastN);
        System.out.println("Domain: " + domain);
        String email = firstN +"" + lastN + "@"+ domain;
        System.out.println("Email: " + email );

        if(email.contains(".net") && email.contains("@")){
            System.out.println("Strong email!");
        }else if(!email.contains("@")){
            System.out.println("Invalid email, must contain @");
        }








    }

}
