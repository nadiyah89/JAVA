interface Checkout {
    void processPayment(double amount);
}

class OnlineCart implements Checkout {
    public void processPayment(double amount) {
        if(amount <= 0) throw new IllegalArgumentException("Invalid payment amount!");
        System.out.println("Payment of " + amount + " processed successfully.");
    }
}

public class CheckoutDemo {
    public static void main(String[] args) {
        try {
            OnlineCart cart = new OnlineCart();
            cart.processPayment(500);
            cart.processPayment(-100);  // will throw exception
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
