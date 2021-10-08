package MyPractices;

public class FrequencyOfChars {

    public static String s (String str){
String result ="";
        String [] chars = str.split("");

        for(String first : chars){
            int count =0;

            for(String second : chars){

                if(second.equals(first)){
                    count++;
                }

                }
            if(!result.contains(first)){
                result += first + count;
            }

        }


return result;
    }

    public static void main(String[] args) {
        System.out.println(s("AAAABBBCF"));

    }
}
