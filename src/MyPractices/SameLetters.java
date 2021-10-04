package MyPractices;

import java.util.Arrays;

public class SameLetters {

    // (abc,cba) - > true

    // (abc,bbc) -> false;

    public static boolean s (String str, String str2) {


        char[] a = str.toCharArray();
        char [] b= str2.toCharArray();

        int a1 = a.length;
        int a2 = b.length;

        if(a1 != a2) {
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a1;i++) {
            if (a[i] != b[i])
                return false;
        }

            return true;


        }


    public static void main(String[] args) {
        System.out.println(s("abc", "bca"));
    }
}
