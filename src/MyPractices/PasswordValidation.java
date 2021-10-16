package MyPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class PasswordValidation {


    public static boolean valid (String pass){


        if(pass.isEmpty() || pass == null || pass.length() <6 || pass.contains(" ")){
            return false;
        }
        boolean checkUpper = false;
        boolean checkLower = false;
        boolean checkNumber = false;
        boolean checkSpecials = false;


        for(int i=0;i<pass.length();i++){
            char c = pass.charAt(i);

            if(Character.isDigit(c)){
                checkNumber = true;
            }else if (Character.isUpperCase(c)){
                checkUpper = true;
            }else if(Character.isLowerCase(c)){
                checkLower = true;
            }else if(!Character.isDigit(c) && !Character.isLetter(c)){
                checkSpecials = true;
            }
        }

        return checkNumber && checkUpper && checkLower && checkSpecials;


    }

    public static void main(String[] args) {
        System.out.println(valid("A67fwad@"));
    }

}
