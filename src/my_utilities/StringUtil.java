package my_utilities;

public class StringUtil {


    /*
    Reverse method

    It will accept the String parameters and return the reverse version of the String
     */
    public static void main(String[] args) {
        System.out.println(reverse("java is good"));
        System.out.println(  fixFormat("imran"));

        System.out.println(getDuplicateCharacters("java"));




    }


    public static String reverse(String original) {
        String reverse = " ";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);


        }
        return reverse.trim();

    }
    /*
    method will accept the String and return a String in proper format

    first character as uppercase and the rest as lowercase.
     */
    public static String fixFormat(String str) {

        return str.substring(0,1).toUpperCase() + str.toLowerCase().substring(1);



    }
    /*
       this method will count how many times a certain letter is in the given String returns the counter value.
     */
    public static int frequencyOfLetter(String word, char letter){
        int counter = 0;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == letter){
                counter++;
            }
        }
        return counter;
    }

    public static String getDuplicateCharacters(String str){

        String allDuplicates = " ";

        for(int i = 0; i <str.length(); i++) {

            if (!allDuplicates.contains(" " + str.charAt(i))) {


                int count = frequencyOfLetter(str, str.charAt(i));

                if (count > 1) {
                    allDuplicates += str.charAt(i);
                }

            }
        }
               return allDuplicates;

    }
}

