package day54_abstraction.Person;

public class Developer extends Employee{

    @Override
    public void sleep(int minutes){

    }
    @Override
    public void work() {
        System.out.println(name + " is developing a code ");
    }
}
