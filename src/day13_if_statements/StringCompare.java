package day13_if_statements;

public class StringCompare {
    public static void main(String[] args) {

        String city = "Chicago";

        if(city.equals("McLean")){
            System.out.println("City is Virginia");
        }else {
            System.out.println("City is not in Virginia");
        }
        if(city.equals("Chicago")) {
            System.out.println("Chicago is Illinois");
        } else {
            System.out.println("City is not in Illinois");
        }

        String str = "Java";
        String str2 = "Java ";

        if(!str.equals(str2)){ // str == str2
            System.out.println("Strings are not equal");
        }else {
            System.out.println("Strings are equal");
        }

        //

    }
}
