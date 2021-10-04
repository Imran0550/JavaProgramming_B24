package day11_if_statements;

public class IfPractice {
    public static void main(String[] args) {

        double hourlyRate = 10.5;
        double hoursWorked = 35;
        double netPay;

        String message;

        if(hoursWorked > 40){
            // overtime calculation
            double overTimeHours = hoursWorked - 40;
            netPay = 40 * hourlyRate;
            netPay += overTimeHours * hourlyRate * 1.5;

            message = "wow you worked " + hoursWorked + " hours so you got paid for " + overTimeHours + " hours overtime, so your total net pay is: " + netPay;
        }else{
            netPay = hoursWorked * hourlyRate;

            message = "You worked " + hoursWorked + " your total net pay is " + netPay;
        }

        System.out.println(message);
    }
}
