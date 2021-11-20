package MyPractices;

public class Recrusion {

    public static int getFactorial(int num){

       if(num ==1){
           System.out.println("method "+ num);
           return 1;
       }else {
           int result = num + getFactorial(num-1);
           System.out.print("Returned " + result);
           System.out.println(" : " + num + " getTN");

           return  result;
       }
    }


    public static int getRecrusion(int number){

        while (number==1){
            System.out.println("method " + number);

            return 1;
        }
        int result = number + getRecrusion(number-1);
        System.out.print("Returned " + result);
        System.out.println(" : " + number + " getTN");

            return result;
    }

    public static void main(String[] args) {
        System.out.println(getRecrusion(6));
    }
}
