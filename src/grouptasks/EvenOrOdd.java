package grouptasks;

public class EvenOrOdd {

    public static String s (int num){
        String result ="";
        if(num%2 == 0){
           result = "even";
        }else {
            result = "odd";
        }

        return result;
    }

    public static void main(String[] args) {
        int a = 101;
        System.out.println(s(a));
    }
}
