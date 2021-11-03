package MyPractices;

public class RemoveDup2 {

  //  String s ="AAAACCCVVV" -> ACV;

    public static String s (String str){

       String result = "";

       String [] a = str.split("");

       for(String each : a){

           if(!result.contains(each)){
               result+=each;
           }

       }
return result;
    }
//
    public static String s2 (String str1){

        //AAABBBCD = CD

        String [] a = str1.split("");
String result = "";
        for (String each: a) {

            int count =0;

            for(String each2 : a){

                if(each2.equals(each)){
                    count++;
                }

            }
            if(count == 1){
                result += each;
            }
        }
        return result;
    }

    public static String s3 (String str2){

        //String str = "AAAATTGGVX" =>A3T2G2V1X1

        String [] a2 = str2.split("");
        String result = "";
        for(String each : a2){

            int count =0;

            for(String each3 : a2){

                if(each3.equals(each)){
                    count++;
                }
            }
            if(!result.contains(each)){
                result += each + count;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(s("AAABBBBDDD"));
        System.out.println();

        System.out.println(s2("AAABBBBDDDEF"));
        System.out.println();
        System.out.println(s3("AAAATTGGVX"));
    }

}
