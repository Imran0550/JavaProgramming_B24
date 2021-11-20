package day01_MyPractice.square;

public class square {

    private double length;

    public square(double length) {
        this.length = length;
    }

    public double circumferenceCalc(){
        return length *4;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
