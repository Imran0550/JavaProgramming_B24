package day54_abstraction.Person;

public class Tester extends Employee{

    @Override
    public void work() {
        System.out.println(name + " is testing");
    }
    @Override
    public void sleep(int minutes){
        System.out.println("Sleeping " + minutes + " While tests run automatically");
    }
}
