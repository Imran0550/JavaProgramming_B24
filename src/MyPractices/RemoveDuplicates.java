package MyPractices;

public class RemoveDuplicates {

    // "aaaabbbcbcb" =>abc


    public static String s(String str) {

        String result = "";



        for (int i = 0; i < str.length()-1; i++) {

          String curChar = str.substring(i, i+1);

          if(!result.contains(curChar)){
              result += curChar;
          }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(s("AAABBBCFHS"));
    }
}
