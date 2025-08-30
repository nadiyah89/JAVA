import java.util.*;

interface Calculator {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);
}

class SimpleCalculator implements Calculator {
    public double add(double a, double b) { return a+b; }
    public double subtract(double a, double b) { return a-b; }
    public double multiply(double a, double b) { return a*b; }
    public double divide(double a, double b) {
        if(b==0) throw new ArithmeticException("Divide by zero!");
        return a/b;
    }
}

public class CalcDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleCalculator c = new SimpleCalculator();
        try {
            System.out.print("Enter two numbers: ");
            double x = sc.nextDouble(), y = sc.nextDouble();
            System.out.println("Sum: " + c.add(x,y));
            System.out.println("Quotient: " + c.divide(x,y));
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
