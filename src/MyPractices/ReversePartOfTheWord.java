package MyPractices;

public class ReversePartOfTheWord {

  //  ==> java is good -> avaj is good;



    public static String s (String str){
        String reverse = "";
        String [] s1 = str.split(" ");

        for(int i=s1[0].length()-1;i>=0;i--){
            reverse += s1[0].charAt(i);
        }
       return reverse + " " +s1[1] + " " + s1[2];
    }

    public static String s1 (String str2){

        String reverse = "";
        for (int i=str2.length()-1;i>=0;i--){
            reverse += str2.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(s("java is good"));

        System.out.println(s1("java is good"));
    }

}
