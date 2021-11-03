package day53_inheritance.shape;

import day53_inheritance.shape.Circle;
import day53_inheritance.shape.Shape;
import day53_inheritance.shape.Square;

public class UseShape {
    public static void main(String[] args) {


        Shape shape = new Shape("Shape");
        System.out.println(shape.name);
        System.out.println(shape.area());
        System.out.println(shape.perimeter());


        Square square = new Square(4);
        System.out.println(square);
        System.out.println(square.name);
        System.out.println(square.area());
        System.out.println(square.perimeter());
        System.out.println();
   Circle circle = new Circle(4);
        System.out.println(circle.radius);
        System.out.println(circle.name);
        System.out.println(circle.area() +"\n" + circle.perimeter());

    }
}
