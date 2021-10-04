package day29_array;

public class LoopArray {
    public static void main(String[] args) {

        int [] num ={1,2 ,3
        };
        // manual way to print all the elements

        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);

        System.out.println();
        // loop through and print all the elements

        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }
}
