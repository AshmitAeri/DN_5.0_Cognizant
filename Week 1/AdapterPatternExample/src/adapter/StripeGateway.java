package adapter;

// Adaptee 2: Stripe Gateway with its own interface
public class StripeGateway {
    public void charge(double amount, String currency) {
        System.out.println("Charging $" + amount + " (" + currency + ") through Stripe.");
    }

    public void initializeStripe(String apiKey) {
        System.out.println("Initializing Stripe with API key: " + apiKey);
    }
}
