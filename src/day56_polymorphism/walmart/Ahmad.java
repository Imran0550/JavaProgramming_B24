package day56_polymorphism.walmart;

public class Ahmad extends WalmartEmployee implements Special{
    @Override
    public void working() {
        System.out.println("Ahmad is working");
    }
    @Override
    public void eatingALot(){
        System.out.println("He is eating alot");
    }
    @Override
    public void sleepingALot(){
        System.out.println("He is sleeping alot;");
    }
}
