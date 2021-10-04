package day19_string;

public class MultipleIndexes {

    public static void main(String[] args) {
                 //0123456789
    String word = "definition";
        System.out.println("First i pos :" + word.indexOf('i'));
        System.out.println("last pos of i: " + word.lastIndexOf('i'));

        int firstPosition = word.indexOf('i'); // 3
        int secondPosition = word.indexOf('i', firstPosition + 1);
        System.out.println(secondPosition);

        int first = word.indexOf('i');
        int third = word.indexOf('i', first  + 4) ;
        System.out.println(third);

        System.out.println("First pos: " + first);
        System.out.println("Sec pos: " + secondPosition);
        System.out.println("Third pos: " + third);

        System.out.println();

        String rst = "iimriir";
        int firstI = rst.indexOf('i');
        int second2 = rst.indexOf('i', firstI + 1);
        System.out.println(second2);
        int secondI = rst.indexOf('i',firstI + 2);
        int thirdI = rst.lastIndexOf('i');
        System.out.println(secondI);
        System.out.println(thirdI);

        System.out.println("first I: " + firstI );
        System.out.println("second ii " + second2);
        System.out.println("second I: " + secondI);
        System.out.println("Third I: " + thirdI);
    }
}
