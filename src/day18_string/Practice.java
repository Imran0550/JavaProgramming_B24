package day18_string;


import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = " ";

        String s = "Imran khan";
        String [] s2 = s.split(" ");


      String d =  s2[1].toUpperCase();

        System.out.println(s2[0] + " " + d);

        System.out.println();
        int countA =0;
        int countSp =0;
        for(int i =0;i < s.length(); i++){

            if(s.charAt(i) == 'a'){
                countA++;
            }

            if(s.charAt(i) == ' '){
                countSp++;
            }
        }
        System.out.println(countA +"\n" + countSp);

        // practice some arrays

        int [] a = {1,2,2,3,4,5};

          for(int i =0; i <a.length;i++){

              if(a[i] == a[i+1]){

                  System.out.println("duplicate");
              }else{
                  System.out.println("Fine!");
                  if(i == 4){
                      break;
                  }
              }
          }




















    }
}
