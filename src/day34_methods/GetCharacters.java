package day34_methods;

public class GetCharacters {

    /*
    - make a method that will print all the letters from A to Z

    - make method that will print all the letters from a to z
    - make method that will print all the letters from Z to A
    - make method that will print all the letters from z to a
    - make method that will print all the letters from 0 to 9



     */

    public static void AToZ(){
        for (char i = 'A'; i <= 'Z';i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void aToz(){
        for(char x = 'a';x <= 'z'; x++){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void ZToA(){
        for(char z = 'Z';z >= 'A'; z--){
            System.out.print( z + " ");
        }
        System.out.println();
    }
    public static void ztoa(){
        for(char z = 'a';z >='z'; z--){
            System.out.print( z + " ");
        }
        System.out.println();
    }
    public static void print0to9(){
        for(int i = 1; i <= 9; i++){
            System.out.print( i + " ");
        }
        System.out.println();
    }


}
