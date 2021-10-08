package day47_constructors;

public class Item {

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Item(String name){

        this.name = name;




    }
    public Item(String name, int quantity, double unitPrice){
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
calculatePrice();
    }
    public void calculatePrice(){
        totalPrice = quantity * unitPrice;

    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
