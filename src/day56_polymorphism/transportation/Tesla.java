package day56_polymorphism.transportation;

public class Tesla extends Car implements SelfDriving,Electric{
    @Override
    public void go(){
        System.out.println("Tesla is driving");
    }
    @Override
    public void Charge() {
        System.out.println("Tesla is charging");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla is in auto pilot");
    }
}
