package MyPractices;

import java.util.ArrayList;

public class GetFromAnArray {

    public static ArrayList<Integer> nums(int [] nums){

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
                  int count =0;
            for(int x=0;x<nums.length;x++){

                if (nums[x] == nums[i]){

                    count++;

                }

            }
            if(count == 1){
                list.add(nums[i]);
            }

        }

return list;

    }

    public static void main(String[] args) {
        int [] a = {1,2,3,3,3,2,6,8};
        System.out.println(nums(a));
    }
}
