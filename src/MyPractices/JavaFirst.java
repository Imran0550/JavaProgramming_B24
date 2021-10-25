package MyPractices;

public class JavaFirst {

//    ===> java is good - true;
//    ===> is good java - false;
//    ===> is java good - false;

    public static boolean s (String str){
        boolean java = false;
        String [] s2 = str.split(" ");

        if(s2[0].equals("java")){
            java = true;
        }else {
            java = false;
        }

        return java;
    }

    public static void main(String[] args) {

        System.out.println(s("is good is"));
    }
}
