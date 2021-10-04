package day12_if_statement;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
        /*
        add a new class ChooseLanguage
add main method
"Choose your language"
int selection -> 1 : "hello, thank for your call"
          -> 2 : "hola, gracias para llamar"
          -> 3 : "merhaba, aradiginiz icin tesekkurler"
          -> 4 : "privet, spasibo za vash zvonok"
          -> 5 : "Merci ,pour votre appel"
          -----> "lets talk in english, hello
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your language. Enter a number from 1 - 5");
        System.out.println("\t1)English\n\t2)Spanish\n\t3)Turkish\n\t4)Russian\n\t5)French");
        int Selection = input.nextInt();
        String message = "";

        if(Selection == 1){
            message = "hello, thank you for your call";
        }else if(Selection == 2){
            message = "hola, gracias para llamar";
        }else if(Selection == 3){
            message = "merhaba, aradiginiz icin tesekkurler";
        }else if(Selection == 4 ){
            message = "privet, spasibo za vash zvonok";
        }else if (Selection == 5 ){
            message = "Merci ,pour votre appel";
        } else {
            message = "lets talk in english, hello";
        }
        System.out.println(message);
    }
}
