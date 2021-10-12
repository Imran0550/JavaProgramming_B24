package MyPractices;

public class RemoveDup2 {

  //  String s ="AAAACCCVVV" -> ACV;

    public static String s (String str){

        String result ="";

        String [] arr = str.split("");

        for(String each: arr){

            if(!result.contains(each)){
                result += each;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(s("AAABBBBDDD"));
    }
}
