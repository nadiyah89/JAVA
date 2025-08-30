import java.util.Scanner;

interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    double radius;
    Circle(double r) { radius = r; }
    public double area() { return Math.PI * radius * radius; }
    public double perimeter() { return 2 * Math.PI * radius; }
}

class Rectangle implements Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
    public double area() { return length * width; }
    public double perimeter() { return 2 * (length + width); }
}

class Triangle implements Shape {
    double a, b, c;
    Triangle(double x, double y, double z) { a = x; b = y; c = z; }
    public double area() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    public double perimeter() { return a+b+c; }
}

public class ShapeDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter radius: ");
            double r = Double.parseDouble(sc.nextLine());
            Circle c = new Circle(r);
            System.out.println("Circle Area: "+c.area()+", Perimeter: "+c.perimeter());
        } catch(NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}
