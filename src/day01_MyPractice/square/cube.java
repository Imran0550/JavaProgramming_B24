package day01_MyPractice.square;

public class cube extends square{

    public cube(double length){
        super(length);
    }

    @Override
    public double circumferenceCalc() {
        return super.circumferenceCalc()*3;
    }

    public double volumeCalc(){
        return getLength()*getLength()*getLength();
    }
}
