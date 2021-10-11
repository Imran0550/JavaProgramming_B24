package officeHours.constructors;

public class DebitCard {

    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    static String accountType;

    public DebitCard(long cardNumber, String holderName, double balance) {

 String length = String.valueOf(cardNumber);

  if(length.equals(16)){
      System.out.println( this.cardNumber = cardNumber);
  }

        this.holderName = holderName;
        this.balance = balance;
    }


    static {
        accountType ="Checking";
    }

    @Override
    public String toString() {
        return "DebitCard{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + cardType + '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }
}
