package InheritancePackage;

import day01_MyPractice.Target.Emp;

public class Employer {

    public static void main(String[] args) {

        Emp1 emp = new Emp1();
        emp.name = "khan";
        emp.working();
        special special = new Emp1();
        System.out.println(((Emp1) special).name); // casting


        Target target = new Emp1();
        System.out.println(((Emp1) target).overtime = true);

        System.out.println();

        Target target1 = new Target();
       // Emp2 emp2 = new Target(); going from child to parent is not gonna work
        Emp2 emp2 = new Emp2();
        Target target2 = new Emp2();
        System.out.println(((Emp2) target2).hours = 40);


    }


}
