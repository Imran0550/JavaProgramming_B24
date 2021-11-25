package InheritancePackage;



public class Emp1 extends Target implements special{

    boolean overtime;
    boolean hardWorker;

    @Override
    public void eat(){
        System.out.println(name + " is eating alot");
    }

}
