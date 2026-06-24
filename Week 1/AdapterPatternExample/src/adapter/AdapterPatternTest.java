package adapter;

// Test class to demonstrate the Adapter Pattern
public class AdapterPatternTest {
    public static void main(String[] args) {
        System.out.println("=== Adapter Pattern Example ===\n");

        // Using PayPal through adapter
        System.out.println("--- PayPal Payment ---");
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(100.00);

        System.out.println();

        // Using Stripe through adapter
        System.out.println("--- Stripe Payment ---");
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(250.50);

        System.out.println();

        // Using Square through adapter
        System.out.println("--- Square Payment ---");
        PaymentProcessor squareProcessor = new SquareAdapter(new SquareGateway());
        squareProcessor.processPayment(75.99);

        System.out.println();

        // Demonstrating polymorphism - all adapters used through the same interface
        System.out.println("--- Processing Multiple Payments via Uniform Interface ---");
        PaymentProcessor[] processors = {
            new PayPalAdapter(new PayPalGateway()),
            new StripeAdapter(new StripeGateway()),
            new SquareAdapter(new SquareGateway())
        };

        double[] amounts = {50.00, 150.00, 300.00};
        for (int i = 0; i < processors.length; i++) {
            System.out.println("\nPayment " + (i + 1) + ":");
            processors[i].processPayment(amounts[i]);
        }
    }
}
