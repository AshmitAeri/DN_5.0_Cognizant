package decorator;

// Concrete Decorator - SMS
public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Delegate to wrapped notifier
        sendSMS(message);    // Add SMS functionality
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
