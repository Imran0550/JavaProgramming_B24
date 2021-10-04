package officeHours.practice_09_22_2021;

public class ArraysAndCharacters {

    /*
      loop, array, String

      method

      frequency of chracter
      Array of String
      find the frequency of a specific chracter

      {"apple","ape" ,"java"}
      'a'

      -> 4

        */

    public static void main(String[] args) {
       String [] arr = {"apple","ape" ,"java"};

        System.out.println(frequencyOfChar(arr, 'a'));
    }

    public static int frequencyOfChar(String [] word, char letter){

        int count =0;

        for(String eachWord : word ){

            char [] arr = eachWord.toCharArray();// you can do this inside the loop directly

            for(char eachLetter: arr ){

                if(eachLetter == letter){
                    count++;
                }
            }
        }
        return count;

    }



}
