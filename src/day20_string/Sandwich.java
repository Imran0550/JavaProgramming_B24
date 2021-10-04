package day20_string;

public class Sandwich {
    public static void main(String[] args) {

        String str = "xxbreadbreadjambreadyy";
        int firstBreadEnd= str.indexOf("bread") + 5;
        int secondBread = str.indexOf("bread", firstBreadEnd);

        if(firstBreadEnd != secondBread){
            System.out.println(str.substring(firstBreadEnd +5 , secondBread));
        }else{
            System.out.println("nothing");
        }



        // solution 1


     //   if(firstBreadEnd >=0 && secondBread >=0) {
       //     System.out.println(str.substring(firstBreadEnd, secondBread));
      //  }else{
      //      System.out.println("nothing");
        //   }
    }
}
