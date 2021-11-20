package day56_polymorphism.Animal;

public class Reptile extends Animal{

    @Override
    public void eat() {
        System.out.println("Reptile is eating - - FROM REPTILE");
    }
}
