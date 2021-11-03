package MyPractices;
import java.util.Scanner;
public class Get3Characters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
String result = "";
        if(word.length()/2 ==0 || word.length()<5){
            System.out.println("Invalid");


        }else{
            int middle = word.length()/2;
          result =  word.substring(middle-1 , middle+2);
        }

        System.out.println(result);
    }

}
