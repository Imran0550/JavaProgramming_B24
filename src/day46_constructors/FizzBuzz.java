package day46_constructors;

public class FizzBuzz {

    public static String fizzBuzz(int num){
        String result ="";
        if(num%3 ==0){
            result += "fizz";
        }
        if(num%5==0){
            result += "buzz";
        }


        return result.isEmpty() ?"" + num : result;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(7));
    }
}
