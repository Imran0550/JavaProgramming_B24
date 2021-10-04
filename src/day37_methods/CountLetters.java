package day37_methods;

public class CountLetters {


    /*
    String, letter

    how many times is the letter in the String

    Example:
    apple, p
     -> 2

     return type : int
     method name: frequencyOfLetter
     parameters: String, char

     */

    public static void main(String[] args) {
        System.out.println( frequencyOfLetter("banana" ,'a'));
        System.out.println(frequencyOfLetter("whatisgoingonman", 'n'));
        System.out.println(frequencyOfLetter("anagram", 'a'));
        System.out.println(frequencyOfLetter("java", 'a'));

        System.out.println(frequencyOfLetter2("afghanistan", 'a'));

        System.out.println(frequencyLetter2("america", 'a'));
    }

    public static int frequencyOfLetter(String word, char letter){
        int counter = 0;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == letter){
                counter++;
            }
        }
        return counter;
    }

    // my own practice;

    public static int frequencyOfLetter2 (String word, char letter2){
        int counter2 = 0;

        for(int i =0; i < word.length(); i++){

            if(word.charAt(i) == letter2){
                counter2++;
            }
        }
        return counter2;



    }
    public static int frequencyLetter2 (String word, char letter){

        int counter = 0;
        for(int i =0; i < word.length();i++){

            if(word.charAt(i) == letter){
                counter++;
            }
        }
        return counter;
    }


}
