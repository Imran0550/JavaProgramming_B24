package MyPractices;

public class FindUnique {


    //String s = "AAAAABBBCDE" -> "CDE"

    public static String s(String str) {

        String result = "";

        for (int i=0;i<str.length();i++){
            int count =0;
            for(int x=0;x<str.length();x++){

                if(str.charAt(x) == str.charAt(i)){
                    count ++;
                }
            }
            if(count == 1){
                result += str.charAt(i);
            }
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println(s("AAABBBCCCDEF"));
    }
}