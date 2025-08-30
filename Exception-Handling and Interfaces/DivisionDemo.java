import java.util.*;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two integers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Result: " + (a/b));
        } catch(ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed.");
        } catch(InputMismatchException e) {
            System.out.println("Error: Invalid input, please enter integers.");
        }
    }
}
