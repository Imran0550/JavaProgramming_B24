package day20_string;

public class ReplaceMethod {
    public static void main(String[] args) {


        String word = "java";
       word = word.replace('a', 'e');
        System.out.println(word);

        String word2 = "mom";
        word2 = word2.replace('o', 'a');
        System.out.println(word2);

        String word3 = "soft skills";
        word3 = word3.replace('s', 'X');
        System.out.println(word3);

        String msg = "Hello today is Sunday";
        System.out.println(msg.replace(" ", "")); // this will delete your spaces.
        System.out.println(msg);

        String msg2 = "mama";
        msg2 = msg2.replace('a', 'e');

        System.out.println(msg2);

    }
}
