package day46_constructors;

public class Address {

    String street;
    String city;
    String state;
    String zipCode;
    String country;


    public Address(String street, String city, String state, String zipCode){

       this.street = street;
         this. city = city;
        this.state = state;
        this.zipCode = zipCode;
        country = "US";



    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address add = new Address("Carriage hill","fredericksburg","va","22305");

        System.out.println(add);
        System.out.println(add.state);


    }
}
