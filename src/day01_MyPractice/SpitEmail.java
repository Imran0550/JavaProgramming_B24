package day01_MyPractice;

public class SpitEmail {

    public static String str (String email){


        if(!email.contains("@")){
            System.out.println("invalid email");
        }else {
            String [] arr = email.split("@");


           if(arr.length == 2){
               System.out.println("Email id = " + arr[0]);
               System.out.println("Email domain = " + arr[1]);
           }else {
               System.out.println("invalid email");
           }

        }

       return email;
    }

    public static void main(String[] args) {
        System.out.println(str("Sayidfnamadf@gmail.com"));
    }
}
