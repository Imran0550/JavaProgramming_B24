package day01_MyPractice;

public class GetEncryptedString {
    public static void main(String[] args) {
        System.out.println(getEncryptedString("hello"));
        System.out.println(getEncryptedString("ifmmp"));
    }


    public static String getEncryptedString(String str){
String str1 = "";
        for(int i=0;i<str.length();i++){
            int number = (int) str.charAt(i);
            number++;

            str1+= (char)number;

        }

return str1;
    }
}
