package day35_methods;

public class Practice {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,6};
        getFirstEl(a);
        getLastEl(a);
    }

    public static void getFirstEl (int [] myNums){

        System.out.println(myNums[0]);
    }
    public static void getLastEl(int [] myNums){

        System.out.println(myNums.length-1);
    }
    public static void middleEl (int [] myNums){

        System.out.println();
    }
}
