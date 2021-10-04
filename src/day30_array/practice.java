package day30_array;


import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

       /*
       Print true if the string "cat" and "dog" appear the same number of times in the given string word.

Example:

input: catdog
output: true

Example:

input: catcat
output: false

Example:

input: cat-cheetah-dog-cat
output: false
        */
        Scanner input = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = input.next();

        int charCount = word.length();
        int tCharCount = 3;

        for(int i =0; i <= charCount - tCharCount; i++){

            String currentWord = word.substring(i, i + tCharCount);
            System.out.println(currentWord);

            if(currentWord.equals("cat")){
                countOfCats++;
            }else if(currentWord.equals("dog")){
                countOfDogs++;
            }
        }
        System.out.println(countOfCats == countOfDogs);





    }
}
