package day01_MyPractice.CodingBat;

public class FunTime {

    public static void main(String[] args) {


        String str = "ABBBCSCSJK";

        String [] arr = str.split("");

        String result ="";

        for (String each : arr){
            int count =0;

            for(String each2 : arr){

                if(each2.equals(each)){
                    count++;
                }

            }
            if(!result.contains(each)){
                result += each + count;
            }
        }

        System.out.println(result);


    }
}
