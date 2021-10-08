package MyPractices;

public class PracriceCode {
    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 5, 18, 6};
   if(nums[0] == 6 ){
       System.out.println(true);
   }else if(nums[nums.length-1] == 6){
       System.out.println(true);
   }else{
       System.out.println(false);
   }
    }
}
