import java.util.Scanner;

class Circle {
    double radius;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.accept();
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}
