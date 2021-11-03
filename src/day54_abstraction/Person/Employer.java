package day54_abstraction.Person;

public class Employer {
    public static void main(String[] args) {

       // Person person = new Person(); cannot create an object of person because it's abstract

        Tester tester = new Tester();
        System.out.println(tester.name = "Kahn");
        tester.sleep(6);
        tester.work();
        System.out.println();
        Developer developer = new Developer();

        developer.work();
        developer.name = "Ahmad";
        developer.sleep(300);
        System.out.println();
        Chef chef = new Chef();
        chef.name = "Hamid";
        chef.work();
        chef.sleep(10);

    }
}
