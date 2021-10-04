package day20_string;

public class IndexOfPractice {
    public static void main(String[] args) {

        String word = "banana";

        int firstA = word.indexOf('a');
        int lastA = word.lastIndexOf('a');
        int middleA = word.indexOf('a', firstA + 1);

        System.out.println(firstA);

        System.out.println(lastA);
        System.out.println(middleA);
        System.out.println();

        String s = "001011010";

        int pos0 = s.indexOf('1');

        int posTwo = s.indexOf('1', pos0 + 1);
        int posThree = s.indexOf('1', + posTwo + 1);
        int posFour = s.indexOf('1', posThree + 2);


        System.out.println(pos0);
        System.out.println(posTwo);
        System.out.println(posThree);
        System.out.println(posFour);


        System.out.println();

        // my own practice

        String s2 = "Imrannana";

        int firstN = s2.indexOf('n');
        System.out.println(firstN);
        int middleN = s2.indexOf('n', firstN + 1);
        System.out.println(middleN);
        int lastN = s2.lastIndexOf('n');
        System.out.println(lastN);
    }
}
