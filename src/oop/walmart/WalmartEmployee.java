package oop.walmart;

import day54_abstraction.hidding.A;

public class WalmartEmployee {

    public static void main(String[] args) {


        Ahmad ahmad = new Ahmad();
        ahmad.eating();

        eating eating = new Ahmad();
        eating.eating();
       // Ahmad ahmad1 = new eating();
        ahmad.setAge(21);
        System.out.println(eating.age);
        System.out.println(ahmad.getAge());
      // refrence            object
        Employee employee = new Ahmad();
        System.out.println(employee.getAge());
        //Ahmad ahmad1 = new Employee(); you can't go from child to parent and remember execution always happens from object side not reffrence side;

        Zee zee = new Zee();
        zee.drinking();


    }
}
