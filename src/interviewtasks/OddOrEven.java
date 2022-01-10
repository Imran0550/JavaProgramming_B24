package interviewtasks;

public class OddOrEven {

    public static void identify(int num){

        if(num%2 ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        identify(5);
        identify(4);


    }
}
