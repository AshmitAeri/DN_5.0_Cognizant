package strategy;

// Concrete Strategy - Credit Card Payment
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
        System.out.println("  Card Holder: " + cardHolderName);
        System.out.println("  Card Number: **** **** **** " + cardNumber.substring(cardNumber.length() - 4));
    }
}
