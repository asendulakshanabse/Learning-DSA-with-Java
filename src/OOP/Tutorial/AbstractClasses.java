package OOP.Tutorial;

abstract class Shape {
    abstract public int getArea();
}

class Rectangle extends Shape {
    int length, width;

    @Override
    public int getArea() {
        return (length * width);
    }
}

class Circle extends Shape {
    int radius;

    @Override
    public int getArea() {
        return (int)(3.14 * radius * radius);
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 12;
        r1.length = 10;
        System.out.println("area of rectangle: " + r1.getArea() + "\n");

        Circle s1 = new Circle();
        s1.radius = 12;
        System.out.println("area of circle: " + s1.getArea() + "\n");


    }
}
