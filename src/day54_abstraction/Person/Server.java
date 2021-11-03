package day54_abstraction.Person;

public class Server extends Employee{

    @Override
    public void sleep(int minutes){

    }

    @Override
    public void work() {
        System.out.println(name + " is serving the guests");
    }
}
