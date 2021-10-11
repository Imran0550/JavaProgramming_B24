package day48_static;

public class MyPhone {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","pacific blue",1250_00,258);

        System.out.println(iphone);
        System.out.println("Brand: " + Iphone.brand);
        System.out.println("the OS is: "+ Iphone.operatingSystem);


    }
}
