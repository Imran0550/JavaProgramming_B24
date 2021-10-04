package day25_loops;

public class LargestSubstring {
    public static void main(String[] args) {

        /*
        given the string find the biggest substring of chars that match and print it.

          Ex: aaaabbbbcccccccdddeee
          output = ccccc
         */

        String str = "aaaabbbbcccccccdddeee";
        String other = "";
        String longestSub = "";

        for(int i = 0; i < str.length() - 1 ; i++){
            other += str.charAt(i);

            if(str.charAt(i) != str.charAt(i + 1)){
                if(other.length() > longestSub.length()){
                    longestSub = other;
                }
                other = "";
            }
        }
        System.out.println(longestSub);
    }
}
