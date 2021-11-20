package MyPractices;

public class StringForFun {


    public static String str(String str){

        String result = "";

        for(int i =0;i<str.length();i++){
            int count =0;
            for(int x=0;x<str.length();x++){

                if(str.charAt(x) == str.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                result += str.charAt(i);
            }

        }
        return result;

    }
    public static String str3(String str2){

        String [] arr = str2.split("");
        String result = "";
        for(String each : arr){
            int count =0;
            for(String each2:arr){

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

    public static int max(int [] arr){

        int max = arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i] >max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int [] a (int []b, int a){

        int length = b.length;
        int [] a2 = new int[length + 1];

        for(int i=0;i<length;i++){
            a2[i] = b[i];

            a2[length] = a;
        }

        return a2;
    }

    public static void main(String[] args) {

        System.out.println(str("AAAABBBJHS"));
        System.out.println(str3("AAAABBBJHS"));
        int [] a ={1,2,3,6,8};
        System.out.println(max(a));
    }
}
