package day54_abstraction.Person;

public abstract class Employee extends Person {

    String jobTitle;
    double salary;

    @Override
    public void sleep(int minutes) {
        System.out.println(name + " is sleeping for " + minutes + " minutes" );
    }

    public abstract void work();

}
