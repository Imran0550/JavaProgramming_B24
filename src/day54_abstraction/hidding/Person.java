package day54_abstraction.hidding;

public class Person {
    String name = "James Bond";

}
class Baby extends Person{
String name = "Mike Smith"; // by creating another name variable in the sub class, we hide the name in the parent
}
class Runner{
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        Baby baby = new Baby();
        System.out.println(baby.name);

        
    }
}