package adapter;

// Adaptee 3: Square Gateway with its own interface
public class SquareGateway {
    public void doPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through Square.");
    }

    public void connectSquareTerminal() {
        System.out.println("Connecting to Square terminal...");
    }
}
