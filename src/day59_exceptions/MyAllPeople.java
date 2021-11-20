package day59_exceptions;

public class MyAllPeople {

    public static void main(String[] args)  {

        Person person = new Person();
       // person.setName(null);
      //  System.out.println(person.getName());

        try {
            person.setAge(-1);
        }catch (Exception e){
            System.out.println("Handled");
        }
        System.out.println(person.getAge());
        //System.out.println(person.getName());



        try {
            person.setName(null);
        }catch (IllegalArgumentException e){
            System.out.println("Invalid name");
        }
        System.out.println(person.getName());

    }

}
