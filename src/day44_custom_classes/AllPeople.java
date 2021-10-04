package day44_custom_classes;

public class AllPeople {

    public static void main(String[] args) {
        // make person object

        Person peronOne = new Person();
        peronOne.name = "James Bond";
        peronOne.age = 40;
        peronOne.hairColor = "Brown";
        peronOne.sex = 'M';
        peronOne.isMarried = true;

        //Q: How to print each field?
        // A: in order to access each instance variable we need to use the reference

        System.out.println("Name: " +peronOne.name);
        System.out.println("Age: " +peronOne.age);
        System.out.println("Hair color: " +peronOne.hairColor);
        System.out.println("Sex: "+peronOne.sex);
        System.out.println("Is married: " + (peronOne.isMarried? "Yes" : "No"));

      //  System.out.println(Person.name); name cannot be accessed because it is not being used with an object
    }

}
