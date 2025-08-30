import java.util.Scanner;

class Rectangle {
    double length, width;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length and Width: ");
        length = sc.nextDouble();
        width = sc.nextDouble();
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.accept();
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
    }
}
