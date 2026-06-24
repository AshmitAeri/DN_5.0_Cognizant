package decorator;

// Test class to demonstrate the Decorator Pattern
public class DecoratorPatternTest {
    public static void main(String[] args) {
        System.out.println("=== Decorator Pattern Example ===\n");

        // Basic email notification
        System.out.println("--- Email Only ---");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Server is down!");

        System.out.println();

        // Email + SMS notification
        System.out.println("--- Email + SMS ---");
        Notifier emailAndSMS = new SMSNotifierDecorator(new EmailNotifier());
        emailAndSMS.send("Disk space low!");

        System.out.println();

        // Email + Slack notification
        System.out.println("--- Email + Slack ---");
        Notifier emailAndSlack = new SlackNotifierDecorator(new EmailNotifier());
        emailAndSlack.send("New deployment completed!");

        System.out.println();

        // Email + SMS + Slack notification (stacking decorators)
        System.out.println("--- Email + SMS + Slack (Stacked Decorators) ---");
        Notifier allChannels = new SlackNotifierDecorator(
                                    new SMSNotifierDecorator(
                                        new EmailNotifier()));
        allChannels.send("Critical security alert!");
    }
}
