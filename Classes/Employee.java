import java.util.Scanner;

class Employee {
    int empID;
    String name;
    double basic, hra, da, gross;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter EmpID: ");
        empID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();
    }

    void calculate() {
        hra = 0.2 * basic;
        da = 0.1 * basic;
        gross = basic + hra + da;
    }

    void printSlip() {
        System.out.println("Salary Slip for " + name + " (ID: " + empID + ")");
        System.out.println("Basic: " + basic + ", HRA: " + hra + ", DA: " + da);
        System.out.println("Gross Salary: " + gross);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.accept();
        e.calculate();
        e.printSlip();
    }
}

