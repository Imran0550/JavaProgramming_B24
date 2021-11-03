package day52_inheritance.PracticeSuper;

public class Employer {
    public static void main(String[] args) {


        Imran imran = new Imran(20, 100000);
        System.out.println(imran.name);
        System.out.println(imran.age);
        System.out.println(imran.salary);

        Sayid sayid = new Sayid(20,1500000);
        System.out.println(sayid.age);
        System.out.println(sayid.name);
        System.out.println(sayid.salary);
    }
}
