package day54_abstraction.Person;

public class Chef extends Employee{

    @Override
    public void sleep(int minutes){
        System.out.println("Sleep with wooden spoon");
    }

    @Override
    public void work(){
        System.out.println("Cooking the meal");

    }
}
