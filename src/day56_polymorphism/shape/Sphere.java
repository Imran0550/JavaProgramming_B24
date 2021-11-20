package day56_polymorphism.shape;

public class Sphere extends Shape implements hasVolume{

double radius;
    @Override
    public double area() {
        return (4/3) * Math.PI * 4 * Math.pow(radius,3);
    }

    @Override
    public double perimeter() {
        return Math.PI * 4 * Math.pow(radius,2);
    }

    @Override
    public double volume() {
        return 2 * Math.PI * radius;
    }
}
