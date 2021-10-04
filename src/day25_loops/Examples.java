package day25_loops;

public class Examples {
    public static void main(String[] args) {

        /*

         */
        String s = "Java is a great language";
        int spaces = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                spaces++;
            }
        }
        System.out.println(spaces);
        int lastC = s.length() -1;
        char lastChar = s.charAt(lastC);

        System.out.println(s.charAt(0) + "" + s.charAt(lastC));
        System.out.println();



    }
}
