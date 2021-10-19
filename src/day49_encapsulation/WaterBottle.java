package day49_encapsulation;

public class WaterBottle {

   private String brand;
   private double ounces;

    public WaterBottle(String brand, double ounces){
        setBrand(brand);
        setOunces(ounces);
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        if(!brand.equals(null) && !brand.equals(" ")){
            this.brand = brand;
        }
    }

    public double getOunces() {
        return ounces;
    }

    public void setOunces(double ounces) {
        if(ounces <0){
            this.ounces = ounces;
        }
    }


}
