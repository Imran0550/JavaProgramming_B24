package officeHours.practice_09_15_2021;

public class LongestPalindrome {
    public static void main(String[] args) {

        /*
        [IQ] Longest Palindrome
Given a String array. Find the longest Palindrome String in your array.
Ex:
Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”] Output: racecar
Ex:
Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
         */

        String [] words= {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longestWord = " ";

        for(String eachWord : words){

            boolean isPalindrome = true;

            for(int i =0; i < eachWord.length() / 2 ; i++){

                if(eachWord.charAt(i) != eachWord.charAt(eachWord.length()-1 - i)){
                    isPalindrome = false;
                    break;

                }
                /*
                the length -1 -i
                part allows you to read the characters from the end in the same number of iteration that (i) goes forwards

                      instead of this approach you could also make another variable that starts from the last index.
                 */

            }
            if(isPalindrome && eachWord.length() > longestWord.length()){
                longestWord = eachWord;
            }


        }
        System.out.println ("Longest: " + (longestWord.isEmpty() ? "No Palindrome" : longestWord));



    }
}
