package decorator;

// Concrete Decorator - Slack
public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // Delegate to wrapped notifier
        sendSlack(message);   // Add Slack functionality
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack notification: " + message);
    }
}
