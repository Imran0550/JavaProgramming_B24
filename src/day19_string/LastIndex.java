package day19_string;

public class LastIndex {
    public static void main(String[] args) {


        // indexOf() -> first occurence
        // lastIndexOf() -> last Occurence
                   // 0123
        String str = "java"; // if you wanna get the last a the use lastIndexOf();
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));

        System.out.println(str.indexOf('v'));
        System.out.println(str.lastIndexOf('v'));

    }
}
