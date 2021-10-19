package day50_inheritance;

public class UsingAnimals {

    public static void main(String[] args) {

      Animal animal = new Animal();
       animal.age = 10;
      // animal has access to 3 variables
       Dog dog = new Dog();
       dog.age = 10;
       dog.hasTail = false;
       // dog has access to 4 variables
       Lion lion = new Lion();
       lion.isKingOfTheJungle = true;
      // lion has access to 5 varibles;

         lion.roar();

    }


}
