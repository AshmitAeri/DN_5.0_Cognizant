package adapter;

// Adapter for PayPal Gateway
public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.verifyPayPalAccount("user@example.com");
        payPalGateway.makePayment(amount);
    }
}
