package MyPractices;

public class Person {

    /*
    `Person` class has following attributes:

 - private String instance variables: `firstName, lastName`

 - private int instance variable: `age`

`Methods:`

  - `getter and setter` methods for each instance variable. try to use `this keyword

   - `toString` method. No parameters and returns person info in this format: ``firstName | lastName | age``
  > Note: does not print! no println in the method!

`Constructors:`

1) **No-Args** constructor

 - sets default values for the Person object
 >name and lastName => "undefined"
 age => -1

2) **3-Args**  Constructor:

 - accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable
 >try to use `this` keyword
     */

    private String firstName;
    private String lastName;
    private int age;

    public Person(){
        firstName = "undefined";
        lastName = "undefined";
        age = 1;
    }
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " | " + lastName + " | " + age;
    }
}
