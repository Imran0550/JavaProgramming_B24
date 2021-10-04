package day35_methods;

public class OurMathClass {

    /*
    add
    subtract
    multiply
    divide
     */

    public static void main(String[] args) {
        add(4.5, 0.5);
        add(1,2);
        subtract(10, 20);
        multiply(10,100);
        division(2,0);

    }

    public static void add(double numOne, double numTwo){
        System.out.println(numOne + " + " + numTwo + " = " + ( numOne+ numTwo));

    }
    public static void subtract(double numOne, double numTwo){
        System.out.println(numOne + " - " + numTwo + " = " + ( numOne - numTwo));;
    }
    public static void multiply(double numO, double numT){
        System.out.println(numO + " X " + numT + " = " + ( numO * numT));
    }
    public static void division(double numOne, double numTwo){
        if(numTwo != 0){
            System.out.println(numOne + " / " + numTwo + " = " +(numOne / numTwo));
        }else{
            System.out.println("Cannot divide by 0");
        }
    }



}
