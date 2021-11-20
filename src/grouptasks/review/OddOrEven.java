package grouptasks.review;

public class OddOrEven {

    public static String s(int num){
        String result = "";
        if(num%2==0){
            result += "Even";
        }else {
            result += "Odd";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(s(5));
    }
}
