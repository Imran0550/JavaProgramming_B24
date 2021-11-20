package day01_MyPractice.Target;

public class Emp extends Target{

    @Override
    public String goodWorker() {
       return getName() + "bullshit";
    }

    public static void main(String[] args) {

        Emp emp = new Emp();
        emp.setName("khan");
        System.out.println(emp.getName());
        System.out.println(emp.goodWorker());


    }
}
