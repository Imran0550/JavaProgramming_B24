package officeHours.practice_10_06_2021;

public class Bank {
    public static void main(String[] args) {


        BankAccount bank = new BankAccount("Sayid Imran", 20000, 45504318957634L, "checking");

        System.out.println(bank);

        System.out.println( bank.deposit(1000));

        bank.withdraw(500);
        System.out.println(bank.checkBalance());

        System.out.println(bank.withdraw(100000));

        System.out.println(bank.deposit(40000));

    }
}
