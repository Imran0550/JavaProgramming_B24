package day19_string;

public class EachCharacter {
    public static void main(String[] args) {

        String java = "java";
        //             0123


        // charAt(number) gives a char based on the number you give

        System.out.println(java.charAt(0));
        System.out.println(java.charAt(1));
        System.out.println(java.charAt(2));
        System.out.println(java.charAt(3));


        char firstLetter = java.charAt(0);

        System.out.println( java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3));
       // above will add the ascii values of the char and print it. char + char
        System.out.println("" + java.charAt(0) + java.charAt(1) + java.charAt(2) + java.charAt(3) );
        // by adding the empty space we can do concatenation and get the character values, not addition. String + char

        String word = "mom";
        String reverse = "" + word.charAt(2) + word.charAt(1) + word.charAt(0);
        System.out.println(reverse);

        if(word.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not palindrome");
        }

    }
}
