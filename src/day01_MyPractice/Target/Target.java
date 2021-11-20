package day01_MyPractice.Target;

public class Target {

   private String name;
   private int age;

   public String getName(){
       return name;
   }
  public void setName(String name)  {
       this.name=name;
  }

  public int getAge(){
       return age;
  }
   public void setAge(int age){
       this.age=age;
   }

   public String goodWorker(){
       return getName() + " is working hard";
   }
}
