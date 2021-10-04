package day19_string;

public class practice {
    public static void main(String[] args) {
        /*
        Given two words. Print the first word without its first character then print the second word without its last character.Input: apple banana Output: pple banan
         */

        String word1 = "apple";
        String word2 = "banana";

        System.out.println(word1.substring(1));
        System.out.println(word2.substring(1));
        System.out.println();

        String word3 = "java is a fun language";
        System.out.println(word3.substring(4));

        System.out.println();

        String name = "James Bond";
        String name2 = "Jamie Bond";
        String lastName = "";
        System.out.println(name + "\n" + name2);
        if(lastName.equals("Bond")){
            System.out.println("Related");
        }else {
            System.out.println("Not Related");
        }


    }
}
