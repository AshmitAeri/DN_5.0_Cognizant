package adapter;

// Adaptee 1: PayPal Gateway with its own interface
public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }

    public void verifyPayPalAccount(String email) {
        System.out.println("Verifying PayPal account: " + email);
    }
}
