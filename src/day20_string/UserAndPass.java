package day20_string;

public class UserAndPass {
    public static void main(String[] args) {

        /*
        [Username and Password]
Given a username and password verify they are valid. - The password cannot be less than 5 characters
If it is less print: "Password cannot be less than 5 characters" If it is more than or equal to 5 print: "Valid password"
- Also, the password should not contain the username - If the password has the username in it print:
"Invalid password, username should not be in it"
Also change the password to have the value: "password"
         */
        String userName = "j";
        String pass = "j";
        if(pass.length() >=5 && !pass.contains(userName)){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
            if(pass.length()< 5){
                System.out.println("password cannot be less than 5 characters ");
            }
            if(pass.contains(userName)){
                System.out.println("Pass cannot contain username");
            }
        }
    }
}
