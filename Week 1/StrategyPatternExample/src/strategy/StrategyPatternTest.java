package strategy;

// Test class to demonstrate the Strategy Pattern
public class StrategyPatternTest {
    public static void main(String[] args) {
        System.out.println("=== Strategy Pattern Example ===\n");

        // Pay using Credit Card
        System.out.println("--- Paying with Credit Card ---");
        PaymentContext context = new PaymentContext(
            new CreditCardPayment("1234567890123456", "John Doe")
        );
        context.executePayment(150.00);

        System.out.println();

        // Switch strategy to PayPal at runtime
        System.out.println("--- Switching to PayPal ---");
        context.setPaymentStrategy(new PayPalPayment("john.doe@email.com"));
        context.executePayment(89.99);

        System.out.println();

        // Switch strategy back to Credit Card with different details
        System.out.println("--- Switching to another Credit Card ---");
        context.setPaymentStrategy(
            new CreditCardPayment("9876543210987654", "Jane Smith")
        );
        context.executePayment(299.50);
    }
}
