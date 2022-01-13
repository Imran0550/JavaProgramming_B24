package day01_MyPractice.CodingBat;

import java.util.ArrayList;
import java.util.List;

public class StringsPractices {
    //== "AAAABBBBBBCCCCC" =>ABC
    public static String removeDup(String str) {
        String result = "";

        for(String each : str.split("")){
            if(!result.contains(each)){
                result +=each;
            }
        }
        return result;
    }

    public static String dupAndCount(String str){
        String [] arr = str.split("");
        String result = "";

        for(String each : arr){
            int count =0;
            for(String each2 : arr){
                if(each2.equals(each)){
                    count++;
                }
            }

            if(!result.contains(each)){
                result +=each+count;
            }
        }

        return result;
    }

    public static String reversePartOFStr(String str){
        String [] arr = str.split(" ");
        String result = "";

        for(int i= arr[0].length()-1;i>=0;i--){
            result += arr[0].charAt(i);
        }

        return result + " " + arr[1];
    }



    public static void main(String[] args) {
        String str = "AAAABBBBBBCCCCC";
        System.out.println(removeDup(str));
        System.out.println(dupAndCount(str));

        String str1 = "java coding";
        System.out.println(reversePartOFStr(str1));

        String s = "str10";
        int num = Integer.parseInt(s.substring(s.length()-2));
        System.out.println(num + 10);
    }
}
