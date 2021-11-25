package day60_collections;

public class Bank {

    /*
    Bank

    balance

    widthraw(double money)

        invalid cases:
        -> money >= balance  -> cause exception
        -> balance < 0       -> cause exception

        valid case:
            "Widthrawing " + money

    hint: throw new IllegalArguementException
     */

    double balance;

    public void withDraw(double money){

        if( balance <=0){
            throw new NotEnoughMoneyException();
        }else if(money > balance){
            throw new IllegalArgumentException();
        }

        System.out.println("Withdrawing $ " + money);
        balance -= money;

    }
}
