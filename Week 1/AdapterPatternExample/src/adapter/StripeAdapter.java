package adapter;

// Adapter for Stripe Gateway
public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.initializeStripe("sk_test_12345");
        stripeGateway.charge(amount, "USD");
    }
}
