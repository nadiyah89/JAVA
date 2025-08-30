import java.util.Scanner;

class Car {
    String model;
    int year;
    double price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Year: ");
        year = sc.nextInt();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(model + " (" + year + ") - Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] cars = new Car[3];
        for (int i = 0; i < 3; i++) {
            cars[i] = new Car();
            cars[i].input();
        }
        System.out.print("Enter price threshold: ");
        double th = sc.nextDouble();
        System.out.println("Cars above threshold:");
        for (Car c : cars) {
            if (c.price > th)
                c.display();
        }
    }
}
