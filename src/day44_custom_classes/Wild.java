package day44_custom_classes;

public class Wild {
    public static void main(String[] args) {

        Animal tiger = new Animal();

        tiger.species ="Tiger";
        tiger.size = "Medium";
        tiger.numberOfLegs = 4;
        tiger.eat();
        tiger.sleeping();

        new Animal().eat();

        Animal panda = new Animal();

        panda.eat();
        panda.species = "Panda";
        panda.eat();
    }
}
