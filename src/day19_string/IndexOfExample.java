package day19_string;

public class IndexOfExample {
    public static void main(String[] args) {


        // CharAt -> takes a number(index) and gives back a Char


        // IndexOf -> takes a char/String and gives back the position/index/number

        String s = "java";
        System.out.println(s.indexOf('j'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('z'));
        System.out.println(s.indexOf('v'));

        System.out.println(s.indexOf("ja"));
        System.out.println(s.indexOf("ava"));
        System.out.println(s.indexOf("Va"));
        System.out.println(s.indexOf("va"));
    }
}
