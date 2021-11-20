package officeHours.practice_11_10_2021;

public class Ipone extends Phone implements AppleApps {


    public Ipone( String model, double price, int size) {
        super("Iphone", model, price, size);
    }

    @Override
    public void facetime() {
        System.out.println("Iphone using facetime");
    }

    @Override
    public boolean download() {
        System.out.println("Downloading from: " + AAPSTORENAME);
        return true;
    }

    @Override
    public void calling() {
        System.out.println("Iphone is calling");
    }

    @Override
    public void texting() {
        System.out.println("Texting on iMessage");

    }
}
