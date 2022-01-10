package interviewtasks;

import java.util.ArrayList;
import java.util.Arrays;

public class IntegerN {

    public static ArrayList<Integer> nums (ArrayList<Integer> numbers){

        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)>100){
                numbers.remove(numbers.get(i));
                i--;
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,4,5,6,101,102,19,89,200));
        System.out.println(nums(nums));
    }
}
