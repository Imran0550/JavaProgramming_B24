package day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {

        /*

            pick 3 colors for the image

            colors need to be unique
         */

        Scanner input = new Scanner(System.in);

        String pickedColors = "";
        int colorsPicked = 0;

        while(colorsPicked < 3){
            System.out.println("Enter a color");
            String colors = input.nextLine();

            if(pickedColors.contains(colors)){
                System.out.println("Pick a different color");
            }else {

                pickedColors += colors + " , ";
                colorsPicked++;
            }
        }
        System.out.println("you picked " + pickedColors);

        System.out.println();

        String picketCol ="";
        int colorPic =0;

        while (colorPic < 4){

            System.out.println("Enter a color of you choice");
            String color = input.next();

            if(picketCol.contains(color)){
                System.out.println("Pick a different color");
            }else{

                picketCol += color+ " , ";
                colorPic++;
            }
        }
        System.out.println(picketCol);


        String colorFr = "";
        int pickCo =0;

        do{
            System.out.println("Enter a color");
            String colo3 = input.next();

            if (colorFr.contains(colo3)){
                System.out.println("Pick another color");
            }else{
                colorFr += colo3 + " , ";
                pickCo++;
            }

        }while (pickCo < 3);
        System.out.println(colorFr);








    }
}
