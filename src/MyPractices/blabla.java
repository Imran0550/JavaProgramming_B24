package MyPractices;

import java.util.AbstractList;
import java.util.ArrayList;

public class blabla {

    public static void main(String[] args) {


        AbstractList<String> nums = new ArrayList<>();

        nums.add("j");
        nums.add("1");
        nums.add("i");
        nums.add("5");
        nums.remove(1);
        nums.add("e");
        nums.add("i");
        nums.remove("i");
        System.out.println(nums);

    }
}
