package MyPractices;

public class RemoveDuplicate {


    // A3B1CC2T1;

    public static String s (String s){
String result ="";

        for(int i=0; i < s.length()-1; i++){

            String Curchar = s.substring(i, i+1);

            if(!result.contains(Curchar)){
                result += Curchar;
            }
        }
       return result;
    }

    public static void main(String[] args) {
        String s = "AAABBTXCC";
        System.out.println(s(s));
    }
}
