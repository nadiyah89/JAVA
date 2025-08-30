import java.util.Scanner;

class Distance {
    int feet, inches;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feet and inches: ");
        feet = sc.nextInt();
        inches = sc.nextInt();
    }

    void toMeters() {
        double totalInches = feet * 12 + inches;
        double cm = totalInches * 2.54;
        double m = cm / 100;
        System.out.println("Meters: " + m + ", Centimeters: " + cm);
    }

    Distance add(Distance d) {
        Distance result = new Distance();
        int totalInches = (feet * 12 + inches) + (d.feet * 12 + d.inches);
        result.feet = totalInches / 12;
        result.inches = totalInches % 12;
        return result;
    }

    public static void main(String[] args) {
        Distance d1 = new Distance();
        Distance d2 = new Distance();
        d1.accept();
        d2.accept();
        d1.toMeters();
        Distance sum = d1.add(d2);
        System.out.println("Sum: " + sum.feet + " feet " + sum.inches + " inches");
    }
}
