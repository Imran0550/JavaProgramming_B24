package MyPractices;

public class ReverseChars {

    // String "imran" => narmi

    public static String s(String str){
        String reverse ="";

        for(int i= str.length()-1;i>=0;i--){
            reverse+= str.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {

        System.out.println(s("Hum"));

    }
}
