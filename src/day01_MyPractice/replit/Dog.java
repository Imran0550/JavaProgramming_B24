package day01_MyPractice.replit;

public class Dog extends Animal{

   String breed;
   int humanYears;

   public Dog(String name, int age, String breed){
       super(name,age);
       this.breed = breed;

   }

    @Override
    public int getAgeInHumanYears() {

        if(getAge() <=2){
          return   age * 11;
        }else {
            return  22 +((age-2) * 5);
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + " Breed: " + breed + "\n" + " Age in calendar years: " + age + "\n" + " Age in human years: " + getAgeInHumanYears();
    }

    public boolean equals(Dog otherDog){
       if(this.name.equals(otherDog.name) && this.age == otherDog.age && this.breed.equals(otherDog.breed)) return true;


       return false;
    }
}
