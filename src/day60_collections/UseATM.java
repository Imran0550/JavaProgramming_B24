package day60_collections;

public class UseATM {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.balance = 300;
        bank.withDraw(200);
       // bank.withDraw(1000);

       //bank.withDraw(-50);

        bank.balance = -10;

        bank.withDraw(20);

    }
}
