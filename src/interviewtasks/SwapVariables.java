package interviewtasks;

public class SwapVariables {

    public static void swap (int a,int b){

        a =a +b;//5
        b = a-b;//3
        a = a -b;//5 - 3 = 2;
        // final = 2,3

        System.out.println(a + " " + b);

    }

    public static void main(String[] args) {
        swap(3,2);
    }
}
