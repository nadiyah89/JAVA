import java.util.Scanner;

class Item {
    int code, qty;
    String name;
    double price;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Item Name: ");
        name = sc.nextLine();
        System.out.print("Enter Quantity: ");
        qty = sc.nextInt();
        System.out.print("Enter Price per Unit: ");
        price = sc.nextDouble();
    }

    double totalPrice() {
        return qty * price;
    }

    void displayBill() {
        System.out.println("Item: " + name + " | Qty: " + qty + " | Unit Price: " + price + " | Total: " + totalPrice());
    }

    public static void main(String[] args) {
        Item it = new Item();
        it.input();
        it.displayBill();
    }
}

