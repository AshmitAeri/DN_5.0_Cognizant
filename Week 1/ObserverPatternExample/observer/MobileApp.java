package observer;

// Concrete Observer - Mobile App
public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[MobileApp - " + appName + "] Notification: " + stockName + " is now $" + price);
    }
}
