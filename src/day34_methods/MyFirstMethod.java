package day34_methods;

public class MyFirstMethod {

   // this method prints hello world
    public static void helloWorld(){

        System.out.println("Hello world");



    }

    public static void helloWorld50Times(){
        for(int i =0; i  < 50; i++){
            System.out.println("Hello world");
        }
    }
     // the main is used to call our method
    public static void main(String[] args) {



        helloWorld50Times();
        System.out.println();
        helloWorld50Times();




       }
    }


