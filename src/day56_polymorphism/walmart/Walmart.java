package day56_polymorphism.walmart;

public class Walmart {
    public static void main(String[] args) {

        Ahmad ahmad = new Ahmad();
        ahmad.working();
        ahmad.sleepingALot();

        Special t5 = new Ahmad();
        WalmartEmployee walmartEmployee2 = new Ahmad();


        WalmartEmployee walmartEmployee = new Hamid();
        walmartEmployee.working();
      //walmartEmployee.talkingALot();
      //  Hamid hamid = new WalmartEmployee(); cannot go from child to parent

        WalmartEmployee walmartEmployee1 = new Zahid();
        walmartEmployee1.working();




    }
}
