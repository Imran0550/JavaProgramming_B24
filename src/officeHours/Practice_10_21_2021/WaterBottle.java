package officeHours.Practice_10_21_2021;

public class WaterBottle {

    private String brand;
    private double ounces;

    public WaterBottle(String brand, double ounces) {
        setBrand(brand);
        setOunces(ounces);
    }

    public String getBrand(){
        return   brand;
    }
    public void setBrand(String brand){
        if (brand != null && !brand.isEmpty()){
            this.brand=brand;
        }
    }

    public double getOunces(){
        return ounces;
    }
    public void setOunces(double ounces){
       if (ounces>0){
           this.ounces=ounces;
       }
    }
}
