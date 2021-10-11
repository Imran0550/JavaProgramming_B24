package MyPractices;

public class SumInString {

    // "12345" -> 15

    public static int sum (String nums){

      int sum=0;



      for(int i=0;i<nums.length();i++){
         char  ch = nums.charAt(i);

          if(Character.isDigit(ch)){
             int n = Character.getNumericValue(ch);

              sum += n;
          }
      }
return sum;
    }

    public static void main(String[] args) {

        System.out.println(sum("341"));
    }
}
