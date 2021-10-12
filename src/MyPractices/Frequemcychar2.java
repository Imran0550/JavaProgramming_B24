package MyPractices;

public class Frequemcychar2 {

//    string = AAAABBBBCCC - > A3B3C3

    public static String str (String s){

        String result ="";
        String [] arr = s.split("");

        for(String first : arr){

            int count =0;

            for(String second : arr){

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
        System.out.println(str("AAABBCCHHFF"));
    }

}
