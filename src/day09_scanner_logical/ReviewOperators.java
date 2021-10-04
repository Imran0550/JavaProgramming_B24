package day09_scanner_logical;

public class ReviewOperators {
    public static void main(String[] args) {


        double budget = 1000;
         budget -=200;

         boolean stillBudget = budget >=0;

        System.out.println("Budget after purchase: " + budget);
        System.out.println("Still in budget: " + stillBudget);

        budget -=500;
         stillBudget = budget >=0;

        System.out.println("Budget after purchase: " + budget);
        System.out.println("Still in budget: " + stillBudget);

        System.out.println(budget !=300); // 300 !=300
        System.out.println(budget !=300.5); // 300.0 != 300.5 -> true

        System.out.println(budget-- == 300); // 300 == 300 -> true, budget = 299
        System.out.println(--budget == 299);// 298 == 299

        int i = 5;
        boolean b = (i = 3) == 5; // 3 == 5
        System.out.println(i);
        System.out.println(b);


        System.out.println(false == !true); // false = false
        System.out.println(false != true);


    }


}
