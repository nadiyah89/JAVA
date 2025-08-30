import java.util.*;

interface BillCalculator {
    double calculateBill(int units);
}

class ElectricityBoard implements BillCalculator {
    public double calculateBill(int units) {
        if(units <= 100) return units*5;
        else if(units <= 200) return 100*5 + (units-100)*7;
        else return 100*5 + 100*7 + (units-200)*10;
    }
}

public class BillDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter units: ");
            int u = sc.nextInt();
            ElectricityBoard eb = new ElectricityBoard();
            System.out.println("Bill: " + eb.calculateBill(u));
        } catch(InputMismatchException e) {
            System.out.println("Invalid input! Please enter integer units.");
        }
    }
}
