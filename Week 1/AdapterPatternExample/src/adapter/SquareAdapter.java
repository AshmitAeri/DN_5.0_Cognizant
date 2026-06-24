package adapter;

// Adapter for Square Gateway
public class SquareAdapter implements PaymentProcessor {
    private SquareGateway squareGateway;

    public SquareAdapter(SquareGateway squareGateway) {
        this.squareGateway = squareGateway;
    }

    @Override
    public void processPayment(double amount) {
        squareGateway.connectSquareTerminal();
        squareGateway.doPayment(amount);
    }
}
