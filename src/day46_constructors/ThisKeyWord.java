package day46_constructors;

public class ThisKeyWord {

    int a =100; // this called instance variables




    public ThisKeyWord(int a){ // a is a local variables
        System.out.println(a);
     a= 400; // reassign the local a to be 400



    }

    public static void main(String[] args) {

        ThisKeyWord key = new ThisKeyWord(70);

        System.out.println(key.a);
        System.out.println();
    }


}
