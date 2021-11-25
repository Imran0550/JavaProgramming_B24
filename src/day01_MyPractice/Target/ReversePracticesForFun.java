package day01_MyPractice.Target;

public class ReversePracticesForFun {


    public static String str (String s){
        String result = "";
        String [] s1 = s.split(" ");

        for(int i = s1[1].length()-1 ;i >=0;i--){
            result += s1[1].charAt(i);
        }

        return s1[0] + " " + result + " " + s1[2];

    }

    public static void main(String[] args) {


        String str = "it's hard tolearn";

        System.out.println(str(str));

    }
}
