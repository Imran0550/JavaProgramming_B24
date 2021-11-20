package day01_MyPractice.square;

public class rectangle extends square{

    public double height;

    public rectangle(double length, double height) {
        super(length);
        this.height=height;
    }

    @Override
    public double circumferenceCalc() {
        return getLength()*2 + height *2;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
