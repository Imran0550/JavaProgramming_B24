package day35_methods;

public class PersonalInformation {

    public static void main(String[] args) {
        buildEmail("Imran nazari", "cyberTek");

        login("inazari007", "nazari007");



    }

    /*
      building up email

      parameters: name (first and last), domain

      buildEmail("james bond", "gmail")
      output = james_bond@gmail.com
     */
    public static void buildEmail(String name, String domain) {
        name = name.replace(" ", "_");
        System.out.println(name + "@" + domain + ".com");

    }
    public static void login(String username, String password){
        if(username.equals("inazari007") && password.equals("nazari007")){
            System.out.println("LOGGED IN");
        }else{
            System.out.println("INVALID CREDENTIALS");
        }
    }
}
